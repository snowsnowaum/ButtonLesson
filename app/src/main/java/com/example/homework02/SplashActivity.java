package com.example.homework02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        /*handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        })*/

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //todo: code that run after delayed 3 sec
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);// This is context นำชื่อคลาสมาแล้วเติมด้วยดอท.this
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}

