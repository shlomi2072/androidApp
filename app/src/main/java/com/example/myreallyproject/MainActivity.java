package com.example.myreallyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button aliveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aliveButton = findViewById(R.id.button_alive);
        aliveButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,Show_alive_images.class));
        });
    }
}