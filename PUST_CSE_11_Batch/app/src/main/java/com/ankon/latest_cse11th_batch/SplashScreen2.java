package com.ankon.latest_cse11th_batch;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen2 extends AppCompatActivity {
    private ProgressBar bar;
    private int p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen2);


        bar=findViewById(R.id.progressID2);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                splashwork();
                intentwork();
            }
        });

        thread.start();





    }

    public void splashwork()
    {

        for(p=60;p<=100;p=p+10) {
            try {
                Thread.sleep(1000);
                bar.setProgress(p);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


    }


    public  void intentwork()
    {

        Intent intent=new Intent(SplashScreen2.this,DuplicateMainActivity.class);
        startActivity(intent);
        finish();


    }






}
