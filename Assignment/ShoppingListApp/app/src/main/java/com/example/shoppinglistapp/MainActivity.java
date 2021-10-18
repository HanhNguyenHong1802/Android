package com.example.shoppinglistapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    List<TextView> list;
    private Button find_store;
    private EditText store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        list.add(findViewById(R.id.textView1));
        list.add(findViewById(R.id.textView2));
        list.add(findViewById(R.id.textView3));
        list.add(findViewById(R.id.textView4));
        list.add(findViewById(R.id.textView5));
        list.add(findViewById(R.id.textView6));
        list.add(findViewById(R.id.textView7));
        list.add(findViewById(R.id.textView8));
        list.add(findViewById(R.id.textView9));
        list.add(findViewById(R.id.textView10));
        store = findViewById(R.id.findStore_text);
        find_store = findViewById(R.id.findStore);
    }

    public void lauchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String x = data.getStringExtra(SecondActivity.SEND);
                for (int i = 0; i < list.size(); i++) {
                    String y = list.get(i).getText().toString();
                    if (y.equals(x)) {
                        break;
                    } else if (list.get(i).getText().toString() == "") {
                        list.get(i).setText(x);
                        break;
                    }
                }
            }
        }
    }

    public void findStoreOnMap(View view) {
        String loc = store.getText().toString();
        Uri addressUri = Uri.parse("geo: 0, 0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }

    }
}
