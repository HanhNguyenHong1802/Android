package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView number;
private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.numberView);
        if(savedInstanceState!=null){
            number.setText(savedInstanceState.getString("reply_text"));
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("reply_text", number.getText().toString());
    }

    public void countUp(View view) {
        ++count;
        if (number != null)
            number.setText(Integer.toString(count));
    }
}