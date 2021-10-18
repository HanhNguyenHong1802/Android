package com.example.shoppinglistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Category extends AppCompatActivity {
    public  static  final String SEND="SEND";
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        bt1 = findViewById(R.id.buttonCheese);
        bt2 = findViewById(R.id.buttonRice);
        bt3 = findViewById(R.id.buttonMango);
        bt4 = findViewById(R.id.buttonBanana);
    }

    public void chooseCheese(View view) {
        Intent intent= new Intent(this, MainActivity.class);
        String cheese= bt1.getText().toString();
        intent.putExtra(SEND, cheese);

        setResult(RESULT_OK,intent);
        finish();
    }

    public void chooseRice(View view) {
        Intent intent= new Intent(this, MainActivity.class);
        String rice= bt2.getText().toString();
        intent.putExtra(SEND, rice);

        setResult(RESULT_OK,intent);
        finish();
    }

    public void chooseMango(View view) {
        Intent intent= new Intent(this, MainActivity.class);
        String mango= bt3.getText().toString();
        intent.putExtra(SEND, mango);

        setResult(RESULT_OK,intent);
        finish();
    }

    public void chooseBanana(View view) {
        Intent intent= new Intent(this, MainActivity.class);
        String banana= bt4.getText().toString();
        intent.putExtra(SEND, banana);

        setResult(RESULT_OK,intent);
        finish();
    }
}