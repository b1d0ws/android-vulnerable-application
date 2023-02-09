package com.example.androidvulnerableapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordVault extends AppCompatActivity {

    EditText usernameVault;
    EditText passwordVault;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_vault);

        Button saveCredentials = findViewById(R.id.buttonSaveCredentials);
        usernameVault = findViewById(R.id.editTextUsernameVault);
        passwordVault = findViewById(R.id.editTextPasswordVault);

        saveCredentials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
                usernameVault.setText("");
                passwordVault.setText("");
            }
        });

    }

    public void saveData()
    {
        sharedPreferences = getSharedPreferences("vaultCredentials", Context.MODE_PRIVATE);
        String name = Base64.encodeToString(usernameVault.getText().toString().getBytes(), Base64.DEFAULT) ;
        String password = Base64.encodeToString(passwordVault.getText().toString().getBytes(), Base64.DEFAULT);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Username", name);
        editor.putString("Password", password);
        editor.commit();
        Toast.makeText(getApplicationContext(), "Suas credenciais foram salvas em nosso cofre", Toast.LENGTH_LONG).show();
    }

}