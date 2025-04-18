package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class FacebookActivity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        webview=(WebView) findViewById(R.id.webviewfacebook);

        webview.loadUrl("https://www.facebook.com");
        WebSettings websettings=webview.getSettings();
        websettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());

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

