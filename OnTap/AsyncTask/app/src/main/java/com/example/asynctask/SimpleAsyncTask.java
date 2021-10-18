package com.example.asynctask;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Integer, String> {
    private WeakReference<TextView> mTextView;
    private WeakReference<TextView> mResultTextView;
    private WeakReference<ProgressBar> mProgressBar;
    private static final int CHUNK_SIZE = 5;
    SimpleAsyncTask(TextView tv, TextView result, ProgressBar bar) {
        mResultTextView = new WeakReference<>(result);
        mTextView = new WeakReference<>(tv);
        mProgressBar = new WeakReference<>(bar);
    }
    @Override
    protected String doInBackground(Void... voids) {
        Random r = new Random();
        int n = r.nextInt(11);

        int s = n * 400;
        int chunkSize = s / CHUNK_SIZE;
        for (int i = 0; i < CHUNK_SIZE; i++) {
            try {
                Thread.sleep(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publishProgress(((i + 1) * 100) / CHUNK_SIZE);
        }
        return "Awake at last after sleeping for " + s + " milliseconds!";
    }


    protected void onPostExecute(String result) {
        mTextView.get().setText(result);
    }

    protected void onProgressUpdate(Integer... values) {
        mProgressBar.get().setProgress(values[0]);
    }
}
