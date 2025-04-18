package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class YoutubeActivity extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        webview = (WebView) findViewById(R.id.webviewyoutube);

        webview.loadUrl("https://www.youtube.com");

    }




}
