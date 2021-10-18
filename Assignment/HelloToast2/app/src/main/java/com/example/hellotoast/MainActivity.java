package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String HELLOTOAST = "HELLOTOAST";
    TextView textView;
    int cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView_main);
    }

    public void count(View view) {
        cnt++;
        if(textView != null) {
            textView.setText(Integer.toString(cnt));
        }
    }

    public void sayHello(View view) {
        String message = textView.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(HELLOTOAST, message);
        startActivity(intent);
    }
}