package com.example.android.elysiais;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class termsAndCondition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);
    }

    public void openScreen3 (View view)
    {
        Intent i = new Intent(this, Screen3.class);
        startActivity(i);
    }

    public void openScreen1 (View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
