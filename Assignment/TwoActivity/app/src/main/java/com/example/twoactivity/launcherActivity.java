package com.example.twoactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.twoactivity.MainActivity.TEXT_REQUEST;

public class launcherActivity extends AppCompatActivity {
public  static final String LOG_TAG="launcherAcitivity";
private EditText mReply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        Intent intent =getIntent();
        String message =intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }
    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, launcherActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("launcher Activity", "==============================================");
        Log.d("launcher Activity", "ondestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("launcher Activity", "==============================================");
        Log.d("launcher Activity", "onpause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

    }
}