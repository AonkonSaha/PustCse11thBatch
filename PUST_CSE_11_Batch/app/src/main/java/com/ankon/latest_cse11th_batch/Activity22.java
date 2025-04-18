package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity22 extends AppCompatActivity {
    private TextView textviewroll,textviewrollA ;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);


        textviewrollA=findViewById(R.id.textroll21A);

        mAdView = findViewById(R.id.adView21);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    }
}
