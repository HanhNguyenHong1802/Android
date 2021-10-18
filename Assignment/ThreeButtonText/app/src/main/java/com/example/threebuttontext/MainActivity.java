package com.example.threebuttontext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TEXT = "TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void SendDatabt1(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.text1);
        intent.putExtra(TEXT, message);
        startActivity(intent);
    }

    public void SendDatabt2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.text2);
        intent.putExtra(TEXT, message);
        startActivity(intent);
    }

    public void SendDatabt3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.text3);
        intent.putExtra(TEXT, message);
        startActivity(intent);
    }
}