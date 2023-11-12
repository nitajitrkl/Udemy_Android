package com.example.android.elysiais;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Screen4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }
    public void startImageVideo (View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/")));
    }
    public void openScreen1 (View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void openScreen5 (View view)
    {
        Intent i = new Intent(this, Screen5.class);
        startActivity(i);
    }
}
