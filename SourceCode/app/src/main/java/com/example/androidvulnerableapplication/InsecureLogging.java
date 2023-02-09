package com.example.androidvulnerableapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InsecureLogging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insecure_logging);

        Button loginInsecure = findViewById(R.id.buttonLoginInsecure);
        EditText username = findViewById(R.id.editTextUsername);
        EditText password = findViewById(R.id.editTextPassword);
        TextView authCompleted = findViewById(R.id.textViewAuthentication);

        loginInsecure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Inserted Credentials", username.getText().toString() + ":" + password.getText().toString());
                username.setText("");
                password.setText("");
                authCompleted.setVisibility(View.VISIBLE);
            }
        });
    }
}