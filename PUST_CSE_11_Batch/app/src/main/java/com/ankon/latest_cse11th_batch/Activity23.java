package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity23 extends AppCompatActivity {
    private TextView textviewroll;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_23);
        textviewroll=findViewById(R.id.textroll22);
        mAdView = findViewById(R.id.adView22);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
}
