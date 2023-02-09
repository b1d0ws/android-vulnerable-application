package com.example.androidvulnerableapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class WebViewAVA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_ava);

        EditText WebViewURL = findViewById(R.id.editTextWebviewUrl);
        Button AccessWebView = findViewById(R.id.buttonWebview);
        WebView webView = findViewById(R.id.webviewModule1);

        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webView.getSettings().setAllowFileAccess(true);

        AccessWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(WebViewURL.getText().toString());
            }
        });
    }
}