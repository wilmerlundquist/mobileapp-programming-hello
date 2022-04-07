package com.example.webviewapp;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    // Add a private member variabel
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Instantiate WebView
        WebView myWebView = (WebView) findViewById(R.id.my_webview);

        // Enable Javascript to our WebViewClient
        myWebView.getSettings().setJavaScriptEnabled(true);

        // Load external url
        myWebView.loadUrl("https://scio.his.se");

        // Sets WebView element active
        setContentView(myWebView);
    }
}
