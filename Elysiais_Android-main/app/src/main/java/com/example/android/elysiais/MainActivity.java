package com.example.android.elysiais;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openScreen2 (View view)
    {
        EditText activationNumber = (EditText) findViewById(R.id.activation_number);
        String number = activationNumber.getText().toString();
        int finalValue = Integer.parseInt(number);
        if (finalValue >= 10000000 && finalValue < 100000000) {
            Intent i = new Intent(this, termsAndCondition.class);
            startActivity(i);
        }
    }

}
