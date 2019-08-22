package com.example.homework02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast t = Toast.makeText(LoginActivity.this,  "Welcome to My ToDo application!", Toast.LENGTH_SHORT);//length short 2-3 sec // long 4-5 sec
        t.show();
    }
}
