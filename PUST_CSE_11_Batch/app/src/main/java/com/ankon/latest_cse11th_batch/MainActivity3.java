package com.ankon.latest_cse11th_batch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity3 extends AppCompatActivity {
    private CardView cardviewstudents,cardviewimage,cardviewweb,cardviewdevelop,cardviewfacebook,cardviewyoutube;

    private WebView webviewdevelop;
    private ImageView pusticon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);
        cardviewstudents=findViewById(R.id.cardid1);
        cardviewimage=findViewById(R.id.cardid2);
        cardviewweb=findViewById(R.id.cardid3);
        cardviewdevelop=findViewById(R.id.cardid9);
        cardviewfacebook=findViewById(R.id.cardid6);
        cardviewyoutube=findViewById(R.id.cardid7);



        cardviewstudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,SplashScreen2.class);
                startActivity(intent);
            }
        });

        cardviewimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,Activitypicture.class);
                startActivity(intent);
            }
        });
        cardviewweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,Activitywebsite.class);
                startActivity(intent);
            }
        });
        cardviewdevelop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,DevelopActivity.class);
                startActivity(intent);



            }
        });

        cardviewfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,FacebookActivity.class);
                startActivity(intent);

            }
        });

        cardviewyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,YoutubeActivity.class);
                startActivity(intent);

            }
        });











    }


}
