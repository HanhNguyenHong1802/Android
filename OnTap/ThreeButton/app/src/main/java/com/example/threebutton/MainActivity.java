package com.example.threebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    public static final String TEXT = "TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button1= findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
    }

    public void showText2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = getString(R.string.text2);
        intent.putExtra(TEXT, message);
        startActivity(intent);
    }

    public void showText1(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = getString(R.string.text1);
        intent.putExtra(TEXT, message);
        startActivity(intent);
    }

    public void showText3(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = getString(R.string.text3);
        intent.putExtra(TEXT, message);
        startActivity(intent);
    }

}