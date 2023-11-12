package com.example.android.elysiais;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }
    public void openScreen4 (View view)
    {
        Intent i = new Intent(this, Screen4.class);
        startActivity(i);
    }
    public void call (View view)
    {
        Uri number = Uri.parse("tel:1234567890");
        Intent i = new Intent(Intent.ACTION_DIAL, number);
        startActivity(i);
    }
}
