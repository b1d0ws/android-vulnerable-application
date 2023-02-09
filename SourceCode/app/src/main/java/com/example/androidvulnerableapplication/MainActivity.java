package com.example.androidvulnerableapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogging = findViewById(R.id.buttonInsecureLogging);
        Button buttonSecretArea = findViewById(R.id.buttonSecretArea);
        Button buttonToBeDone = findViewById(R.id.buttonToBeDone);
        Button buttonPasswordVault = findViewById(R.id.buttonPasswordVault);
        Button buttonWebViewVuln = findViewById(R.id.buttonWebViewVuln);
        Button buttonRootBypass = findViewById(R.id.buttonRootBypass);
        Button buttonHookFlag = findViewById(R.id.buttonHookFlag);

        buttonLogging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, InsecureLogging.class);
                startActivity(intent);

            }
        });

        buttonSecretArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecretArea.class);
                startActivity(intent);

            }
        });

        buttonToBeDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, UnderConstruction.class);
                startActivity(intent);

            }
        });

        buttonPasswordVault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PasswordVault.class);
                startActivity(intent);

            }
        });

        buttonWebViewVuln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, WebViewAVA.class);
                startActivity(intent);

            }
        });

        buttonRootBypass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RootBypass.class);
                startActivity(intent);

            }
        });

        buttonHookFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, HookFlag.class);
                startActivity(intent);

            }
        });
    }
}