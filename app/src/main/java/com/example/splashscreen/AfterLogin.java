package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AfterLogin extends AppCompatActivity {
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        text=findViewById(R.id.Loginid);
        Bundle b = getIntent().getExtras();
        String sentence =b.getString("user");
        text.setText("Bonjour "+sentence+ " " +
                " Bienvenue dans GYM-APP");


    }

}