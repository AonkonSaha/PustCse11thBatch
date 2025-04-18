package com.ankon.latest_cse11th_batch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button br1,br2,br3,br4,br5,br6,br7,br8,br9,br10,br11,br12,br13,br14,br15,br16,br17,br18,br19,br20,br21,br22,br23,br24,br25,br26,br27
            ,br28,br29,br30,br31,br32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_duplicate_main);


        br1=(Button) findViewById(R.id.roll1);///br means button roll...
        br2=(Button) findViewById(R.id.roll2);
        br3=(Button) findViewById(R.id.roll3);
        br4=(Button) findViewById(R.id.roll4);
        br5=(Button) findViewById(R.id.roll5);
        br6=(Button) findViewById(R.id.roll6);
        br7=(Button) findViewById(R.id.roll7);
        br8=(Button) findViewById(R.id.roll8);
        br9=(Button) findViewById(R.id.roll9);
        br10=(Button) findViewById(R.id.roll10);
        br11=(Button) findViewById(R.id.roll11);
        br12=(Button) findViewById(R.id.roll12);
        br13=(Button) findViewById(R.id.roll13);
        br14=(Button) findViewById(R.id.roll14);
        br15=(Button) findViewById(R.id.roll15);
        br16=(Button) findViewById(R.id.roll16);
        br17=(Button) findViewById(R.id.roll17);
        br18=(Button) findViewById(R.id.roll18);
        br19=(Button) findViewById(R.id.roll19);
        br20=(Button) findViewById(R.id.roll20);
        br21=(Button) findViewById(R.id.roll21);
        br22=(Button) findViewById(R.id.roll22);
        br23=(Button) findViewById(R.id.roll23);
        br24=(Button) findViewById(R.id.roll24);
        br25=(Button) findViewById(R.id.roll25);
        br26=(Button) findViewById(R.id.roll26);
        br27=(Button) findViewById(R.id.roll27);
        br28=(Button) findViewById(R.id.roll28);
        br29=(Button) findViewById(R.id.roll29);
        br30=(Button) findViewById(R.id.roll30);
        br31=(Button) findViewById(R.id.roll31);
        br32=(Button) findViewById(R.id.roll32);



   br1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intentroll1=new Intent(MainActivity.this,Actitvity2.class);
           startActivity(intentroll1);
       }
   });

 br2.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intentroll2=new Intent(MainActivity.this,Activity3.class);
         startActivity(intentroll2);
     }
 });

 br3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentroll3=new Intent(MainActivity.this,Acticity4.class);
                startActivity(intentroll3);
            }
        });

        br4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             Intent   intentroll4 = new Intent(MainActivity.this,Acitivity5.class);
                startActivity(intentroll4);
            }
        });

        br5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             Intent  intentroll5= new Intent(MainActivity.this,Activity6.class);
                startActivity(intentroll5);
            }
        });


        br6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll6= new Intent(MainActivity.this,Activity7.class);
                startActivity(intentroll6);
            }
        });

        br7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll7= new Intent(MainActivity.this,Activity8.class);
                startActivity(intentroll7);
            }
        });

        br8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll8= new Intent(MainActivity.this,Activity9.class);
                startActivity(intentroll8);
            }
        });



        br9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll9= new Intent(MainActivity.this,Activity10.class);
                startActivity(intentroll9);
            }
        });



        br10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll10= new Intent(MainActivity.this,Activity11.class);
                startActivity(intentroll10);
            }
        });

        br11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll11= new Intent(MainActivity.this,Activity12.class);
                startActivity(intentroll11);
            }
        });

        br12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll12= new Intent(MainActivity.this,Activity13.class);
                startActivity(intentroll12);
            }
        });

        br13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll13= new Intent(MainActivity.this,Activity14.class);
                startActivity(intentroll13);
            }
        });

        br14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll14= new Intent(MainActivity.this,Activity15.class);
                startActivity(intentroll14);
            }
        });


        br15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll15= new Intent(MainActivity.this,Activity16.class);
                startActivity(intentroll15);
            }
        });

        br16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll16= new Intent(MainActivity.this,Activity17.class);
                startActivity(intentroll16);
            }
        });

        br17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll17= new Intent(MainActivity.this,Activity18.class);
                startActivity(intentroll17);
            }
        });
        br18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll18= new Intent(MainActivity.this,Activity19.class);
                startActivity(intentroll18);
            }
        });
        br19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll19= new Intent(MainActivity.this,Activity20.class);
                startActivity(intentroll19);
            }
        });


        br20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll20= new Intent(MainActivity.this,Activity21.class);
                startActivity(intentroll20);
            }
        });

        br21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll21= new Intent(MainActivity.this,Activity22.class);
                startActivity(intentroll21);
            }
        });

        br22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll22= new Intent(MainActivity.this,Activity23.class);
                startActivity(intentroll22);
            }
        });

        br23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll23= new Intent(MainActivity.this,Activity24.class);
                startActivity(intentroll23);
            }
        });

        br24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll24= new Intent(MainActivity.this,Activity25.class);
                startActivity(intentroll24);
            }
        });
        br25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll25= new Intent(MainActivity.this,Activity26.class);
                startActivity(intentroll25);
            }
        });
        br26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll26= new Intent(MainActivity.this,Activity27.class);
                startActivity(intentroll26);
            }
        });

        br27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll27= new Intent(MainActivity.this,Activity28.class);
                startActivity(intentroll27);
            }
        });

        br28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll28= new Intent(MainActivity.this,Activity29.class);
                startActivity(intentroll28);
            }
        });

        br29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll29= new Intent(MainActivity.this,Activity30.class);
                startActivity(intentroll29);
            }
        });


        br30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll30= new Intent(MainActivity.this,Activity31.class);
                startActivity(intentroll30);
            }
        });

        br31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll31= new Intent(MainActivity.this,Activity32.class);
                startActivity(intentroll31);
            }
        });

        br32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll32= new Intent(MainActivity.this,Activity33.class);
                startActivity(intentroll32);
            }
        });


    }
}
