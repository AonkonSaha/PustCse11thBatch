package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Activitywebsite extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitywebsite);
        webview=(WebView) findViewById(R.id.pustwebsiteid);
        WebSettings websettings=webview.getSettings();
        websettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.pust.ac.bd");

    }


    @Override
    public void onBackPressed() {

        if (webview.canGoBack()) {

            webview.goBack();
        }
        else
        {

            super.onBackPressed();
        }


    }





}
