package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity21 extends AppCompatActivity {
    private TextView textviewroll20,textviewroll20A;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);
        textviewroll20=findViewById(R.id.textroll20);
        textviewroll20A=findViewById(R.id.textroll20A);

        mAdView = findViewById(R.id.adView20);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
