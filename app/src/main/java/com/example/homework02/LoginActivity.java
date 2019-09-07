package com.example.homework02;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.homework02.model.Auth;

public class LoginActivity extends AppCompatActivity /*implements View.OnClickListener*/ {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);// R.ด้วยประเภทของ resource เช่น drawable
        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.email_edit_text);
                EditText passwordEditText = findViewById(R.id.password_edit_text);
                CheckBox rememberPasswordCheckBox = findViewById(R.id.remember_password_checkbox);
                if(rememberPasswordCheckBox.isChecked()){
                    Toast.makeText(LoginActivity.this,"Already remember",Toast.LENGTH_SHORT).show();// Method that check the checkbox checked or notChecked
                }else{
                    Toast.makeText(LoginActivity.this,"Not remember",Toast.LENGTH_SHORT).show();
                }

                //String inputEmail = emailEditText.getText().toString();
                //String inputPassword = passwordEditText.getText().toString();

                Auth auth =new Auth(emailEditText.getText().toString(),passwordEditText.getText().toString());
                //auth.setnEmail(emailEditText.getText().toString());
                //auth.setnPassword(passwordEditText.getText().toString());
                //getString(R.string.login_fail)   How to getString
                //getString(R.string.login_success) How to getString
                if(auth.check()){
                    Toast.makeText(LoginActivity.this, R.string.login_success, Toast.LENGTH_SHORT).show();
                }else{

                    //Toast.makeText(LoginActivity.this, R.string.login_fail, Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this );
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_fail);
                    // button have 3 type : setPositive, setNegative ,setNeutral
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // code that run when user fail to login
                            //todo:

                        }
                    });
                    dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }
                //Toast t = Toast.makeText(LoginActivity.this,  "Welcome to My ToDo application!", Toast.LENGTH_SHORT);//length short 2-3 sec // long 4-5 sec
                //t.show();
            }
        });
        /*Toast t = Toast.makeText(LoginActivity.this,  "Welcome to My ToDo application!", Toast.LENGTH_SHORT);//length short 2-3 sec // long 4-5 sec
        t.show();*/
        //Button loginButton = findViewById(R.id.login_button);
        // create listener
        //MyListener listener = new MyListener();
        //loginButton.setText("Hello");
        // ผุก listener กับ button
        //loginButton.setOnClickListener(listener);
        /*loginButton.setOnClickListener(new View.OnClickListener(){
            //create Anonymous Inner Class
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(LoginActivity.this,  "Welcome to My ToDo application!", Toast.LENGTH_SHORT);//length short 2-3 sec // long 4-5 sec
                t.show();
                //Ctrl+O
            }
        });*/
        //loginButton.setOnClickListener(this);

    }

    /*@Override
    public void onClick(View view) {
        Toast t = Toast.makeText(LoginActivity.this,  "Welcome to My ToDo application!", Toast.LENGTH_SHORT);//length short 2-3 sec // long 4-5 sec
        t.show();
    }*/
    /*private class MyListener implements View

            .OnClickListener{
        @Override
        public void onClick(View view) {
            Toast t = Toast.makeText(LoginActivity.this,  "Welcome to My ToDo application!", Toast.LENGTH_SHORT);//length short 2-3 sec // long 4-5 sec
            t.show();
        }
    }*/
}
