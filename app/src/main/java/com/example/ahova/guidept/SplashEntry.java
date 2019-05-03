package com.example.ahova.guidept;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashEntry extends AppCompatActivity {

    private int SPLASH_TIME = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_entry);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(SPLASH_TIME);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent openWndow = new Intent(SplashEntry.this, MainActivity.class);
                    startActivity(openWndow);
                }
            }
        };
        timer.start();
    }
}
