package com.example.shoppinglistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button bt10;
    private Button bt11;
    private Button bt12;
    private Button bt13;
    private Button bt14;
    public static final String SEND = "SEND";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);
        bt5 = findViewById(R.id.button5);
        bt6 = findViewById(R.id.button6);

        bt7 = findViewById(R.id.button7);
        bt8 = findViewById(R.id.button8);
        bt9 = findViewById(R.id.button9);

        bt10 = findViewById(R.id.button10);
        bt11 = findViewById(R.id.button11);
        bt12 = findViewById(R.id.button12);
        bt13 = findViewById(R.id.button13);
        bt14 = findViewById(R.id.button14);

    }


    public void addList1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt1.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt2.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList3(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt3.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList4(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt4.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList5(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt5.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList6(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt6.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList7(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt7.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList8(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt8.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList9(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt9.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList10(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt10.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList11(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt11.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList12(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt12.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList13(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt13.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addList14(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String reply = bt14.getText().toString();
        intent.putExtra(SEND, reply);
        setResult(RESULT_OK, intent);
        finish();
    }
}
