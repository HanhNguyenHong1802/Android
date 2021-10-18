package com.example.dialogforalert;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle(R.string.alert_title);
        myAlertBuilder.setMessage(R.string.alert_message);
        myAlertBuilder.setPositiveButton("OK", (dialog, which) -> {
            // User clicked OK button.
            Toast.makeText(getApplicationContext(), "Pressed OK",
                    Toast.LENGTH_SHORT).show();
        });
        myAlertBuilder.setNegativeButton("Cancel", (dialog, which) -> {
            // User cancelled the dialog.
            Toast.makeText(getApplicationContext(), "Pressed Cancel",
                    Toast.LENGTH_SHORT).show();
        });
        myAlertBuilder.show();
    }

    public void nextLesson(View view) {
        Intent intent= new Intent(this, PickerForDate.class);
        startActivity(intent);
    }
}