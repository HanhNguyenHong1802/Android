package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int mCount = 0;
    TextView mShowCount ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount =findViewById(R.id.counter_text);
        if (savedInstanceState != null) {
            boolean isVisible =
                    savedInstanceState.getBoolean("count_number");
            if (isVisible) {
                mShowCount.setVisibility(View.VISIBLE);
                mShowCount.setText(savedInstanceState
                        .getString("count_number"));
                mShowCount.setVisibility(View.VISIBLE);
            }

        }

    }
    public void counterTextView(View view) {
        ++mCount;
        mShowCount.setText(Integer.toString(mCount));
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mShowCount.getVisibility() == View.VISIBLE) {
            outState.putBoolean("count_number", true);
            outState.putInt("count_number", mCount);
        }
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mCount =savedInstanceState.getInt("count_number");
        mShowCount.setText(String.valueOf(mCount));
    }
}