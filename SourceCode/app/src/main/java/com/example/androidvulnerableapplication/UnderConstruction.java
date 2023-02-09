package com.example.androidvulnerableapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class UnderConstruction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_construction);

        // To be implemented
        Intent intent = new Intent(UnderConstruction.this, Developers.class);

        String test = "For now we are just testing ma frend.";
    }
}