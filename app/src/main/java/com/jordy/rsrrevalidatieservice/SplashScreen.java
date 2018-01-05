package com.jordy.rsrrevalidatieservice;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * This class shows a splashscreen with the RSR logo on startup.
 */

public class SplashScreen extends AppCompatActivity{

    private int milliSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.splash_screen);
        milliSeconds = 1500;

        // Start home activity
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, milliSeconds);

    }
}
