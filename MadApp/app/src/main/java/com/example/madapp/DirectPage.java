package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DirectPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direct_page);
        getSupportActionBar().setTitle("Login Form");
    }

    public void btn_signUp_Form(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
