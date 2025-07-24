package com.example.makeupproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    EditText usernameEditText, emailEditText, passwordEditText;
    Button createAccountButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        createAccountButton = findViewById(R.id.button3);
        loginButton = findViewById(R.id.button4);

        createAccountButton.setOnClickListener(v -> {
            Intent intent = new Intent(Signup.this, Home.class);
            startActivity(intent);
            finish();
            }
        );

        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(Signup.this, Login.class);
            startActivity(intent);
            finish();
        });
    }
}
