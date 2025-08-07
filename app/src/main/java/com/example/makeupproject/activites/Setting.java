package com.example.makeupproject.activites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.makeupproject.R;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_setting);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView back_btn= findViewById(R.id.imageView3);
        back_btn.setOnClickListener(v -> {
            Intent intent =new Intent(Setting.this, Home.class);
            startActivity(intent);
        });
        Button sign_out= findViewById(R.id.sign_out);
        sign_out.setOnClickListener(v -> {
            Intent intent =new Intent(Setting.this, Login.class);
            startActivity(intent);
        });
    }
}