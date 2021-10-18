package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox int_id, double_id, string_id, all;
    Button test, hint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_meat:
                if (checked)
                    displayToast("Put some meat on the sandwich");
                // Put some meat on the sandwich
            else
                // Remove the meat
                    displayToast("Remove the meat");
                break;
            case R.id.checkbox_cheese:
                if (checked)
                // Cheese me
                    displayToast("Cheese me");
            else
                // I'm lactose intolerant
                    displayToast("I'm lactose intolerant");
                break;
            // TODO: Veggie sandwich
        }
    }
}