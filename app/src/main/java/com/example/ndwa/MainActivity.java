package com.example.ndwa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends Activity {
    private static boolean splashLoaded = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!splashLoaded) {
        setContentView(R.layout.activity_main);
            int secondsDelayed = 1;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(MainActivity.this, TheMain.class));
                    finish();
                }
            }, secondsDelayed * 500);

            splashLoaded = true;
        }
        else {
            Intent goToMainActivity = new Intent(MainActivity.this, TheMain.class);
            goToMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(goToMainActivity);
            finish();
        }
    }
}
