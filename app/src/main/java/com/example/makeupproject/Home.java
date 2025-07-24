package com.example.makeupproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button pbtn= findViewById(R.id.Pbutton);
                pbtn.setOnClickListener(v -> {
                    Intent intent =new Intent(Home.this, Product.class);
                    startActivity(intent);
                });
        TextView con_btn= findViewById(R.id.con_btn);
        con_btn.setOnClickListener(v -> {
            Intent intent =new Intent(Home.this, Product.class);
            startActivity(intent);
        });
        ImageView settin= findViewById(R.id.icon2);
        settin.setOnClickListener(v -> {
            Intent intent =new Intent(Home.this, Setting.class);
            startActivity(intent);
        });
    }
}
