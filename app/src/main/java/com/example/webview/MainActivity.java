package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView winkyWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winkyWeb = findViewById(R.id.winkyWeb);

        winkyWeb.getSettings().setJavaScriptEnabled(true);
        winkyWeb.loadUrl("https://www.winkytech.com");
    }
}