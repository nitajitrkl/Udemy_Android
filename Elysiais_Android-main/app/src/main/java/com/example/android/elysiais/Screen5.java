package com.example.android.elysiais;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class Screen5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);
    }
    public void openScreen1 (View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void openScreen6 (View view)
    {
        Intent i = new Intent(this, Screen5.class);
        startActivity(i);
    }
    static final int REQUEST_IMAGE_CAPTURE = 1;
    public void openCameraFC (View view)
    {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null)
        {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
