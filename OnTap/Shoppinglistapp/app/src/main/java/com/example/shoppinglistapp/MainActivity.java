package com.example.shoppinglistapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public  static final int TEXT_REQUEST=1;
    List<TextView> list;
    private EditText location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list= new ArrayList<>();
        list.add(findViewById(R.id.text1));
        list.add(findViewById(R.id.text2));
        list.add(findViewById(R.id.text3));
        list.add(findViewById(R.id.text4));
        list.add(findViewById(R.id.text5));
        list.add(findViewById(R.id.text6));
        list.add(findViewById(R.id.text7));
        list.add(findViewById(R.id.text8));
        list.add(findViewById(R.id.text9));
        list.add(findViewById(R.id.text10));
        location=findViewById(R.id.text_location);
    }

    public void addItem(View view) {
        Intent intent= new Intent(this, Category.class);
        startActivityForResult(intent,TEXT_REQUEST);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String x= data.getStringExtra(Category.SEND);
                for (int i = 0; i < list.size(); i++) {
                    String y= list.get(i).getText().toString();
                    if(y.equals(x)){
                        break;
                    }
                    else if (list.get(i).getText().toString() == "") {
                        list.get(i).setText(x);
                        break;
                    }
                }
            }
        }
    }

    public void searchLocation(View view) {
        String loc= location.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent= new Intent(Intent.ACTION_VIEW, addressUri);
        intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
    }
}