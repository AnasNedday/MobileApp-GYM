package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.iduser);
        password=findViewById(R.id.idpass);


    }
    public void envoyer(View view){
        Intent intent=new Intent(getApplicationContext(),AfterLogin.class);
        Bundle b= new Bundle();
        b.putString("user",user.getText().toString());
        b.putString("password",password.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}