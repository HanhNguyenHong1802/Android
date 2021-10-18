package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE =
            "com.example.hellotoast.extra.EXTRA_MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount+=1;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void sayHello(View view) {
        Intent intentNum = new Intent(this, MainActivity2.class);
        String message = mShowCount.getText().toString();
        intentNum.putExtra(EXTRA_MESSAGE, message);
        startActivity(intentNum);
    }
}