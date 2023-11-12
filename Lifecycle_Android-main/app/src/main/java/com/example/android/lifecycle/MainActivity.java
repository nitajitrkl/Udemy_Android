package com.example.android.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Main Activity","OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Main Activity","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Main Activity","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Main Activity","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Main Activity","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Main Activity","OnDestroy");
    }
}
