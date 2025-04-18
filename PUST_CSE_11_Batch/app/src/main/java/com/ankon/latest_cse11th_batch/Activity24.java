package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity24 extends AppCompatActivity {
    private TextView textviewroll23,linktextview23;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_24);

        textviewroll23=(TextView) findViewById(R.id.textroll23);
        linktextview23=(TextView) findViewById(R.id.Link23);
        mAdView = findViewById(R.id.adView23);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
}
