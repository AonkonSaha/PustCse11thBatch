package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity13 extends AppCompatActivity {


    private TextView textview12;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);
        textview12=findViewById(R.id.textroll2);

        mAdView = findViewById(R.id.adView12);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
