package com.example.makeupproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);  // ربط التصميم الصحيح

        Button btnLogin = findViewById(R.id.button);
        Button btnSignUp = findViewById(R.id.button2);

        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(Screen.this, Login.class);
            startActivity(intent);
        });

        btnSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(Screen.this, Signup.class);
            startActivity(intent);
        });
    }
}
