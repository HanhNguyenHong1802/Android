package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intentNumber = getIntent();
        String messageNum = intentNumber.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView numView = findViewById(R.id.numberView);
        numView.setText(messageNum);
    }
}