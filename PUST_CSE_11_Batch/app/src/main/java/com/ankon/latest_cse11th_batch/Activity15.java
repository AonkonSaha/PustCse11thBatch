package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity15 extends AppCompatActivity {
private TextView textview14;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);



        textview14=findViewById(R.id.textroll14);

        mAdView = findViewById(R.id.adView14);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





    }
}
