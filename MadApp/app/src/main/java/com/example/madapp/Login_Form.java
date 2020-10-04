package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	//LatestOverride
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);
        getSupportActionBar().setTitle("Login Form");
    }

	//New Method
    public void btn_directPage(View view) {
        startActivity(new Intent(getApplicationContext(),DirectPage.class));
    }
}
