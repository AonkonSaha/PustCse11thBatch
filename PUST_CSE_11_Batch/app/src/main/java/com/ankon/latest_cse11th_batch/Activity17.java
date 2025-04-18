package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity17 extends AppCompatActivity {
    private TextView textview16;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_17);
        textview16=(TextView) findViewById(R.id.textroll16);

        mAdView = findViewById(R.id.adView16);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
