package com.ankon.latest_cse11th_batch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DuplicateMainActivity extends AppCompatActivity {
    private CardView br1,br2,br3,br4,br5,br6,br7,br8,br9,br10,br11,br12,br13,br14,br15,br16,br17,br18,br19,br20,br21,br22,br23,br24,br25,br26,br27
            ,br28,br29,br30,br31,br32,br33,br34,br35,br36,br40,br41,br42,br43;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_duplicate_main);



        br1=(CardView) findViewById(R.id.roll1);///br means button roll...
        br2=(CardView) findViewById(R.id.roll2);
        br3=(CardView) findViewById(R.id.roll3);
        br4=(CardView) findViewById(R.id.roll4);
        br5=(CardView) findViewById(R.id.roll5);
        br6=(CardView) findViewById(R.id.roll6);
        br7=(CardView) findViewById(R.id.roll7);
        br8=(CardView) findViewById(R.id.roll8);
        br9=(CardView) findViewById(R.id.roll9);
        br10=(CardView) findViewById(R.id.roll10);
        br11=(CardView) findViewById(R.id.roll11);
        br12=(CardView) findViewById(R.id.roll12);
        br13=(CardView) findViewById(R.id.roll13);
        br14=(CardView) findViewById(R.id.roll14);
        br15=(CardView) findViewById(R.id.roll15);
        br16=(CardView) findViewById(R.id.roll16);

        br17=(CardView) findViewById(R.id.roll17);
        br18=(CardView) findViewById(R.id.roll18);
        br19=(CardView) findViewById(R.id.roll19);
        br20=(CardView) findViewById(R.id.roll20);
        br21=(CardView) findViewById(R.id.roll21);
        br22=(CardView) findViewById(R.id.roll22);
        br23=(CardView) findViewById(R.id.roll23);
        br24=(CardView) findViewById(R.id.roll24);
        br25=(CardView) findViewById(R.id.roll25);
        br26=(CardView) findViewById(R.id.roll26);
        br27=(CardView) findViewById(R.id.roll27);
        br28=(CardView) findViewById(R.id.roll28);
        br28=(CardView) findViewById(R.id.roll28);
        br29=(CardView) findViewById(R.id.roll29);
        br30=(CardView) findViewById(R.id.roll30);
        br31=(CardView) findViewById(R.id.roll31);
        br32=(CardView) findViewById(R.id.roll32);
        br33=(CardView) findViewById(R.id.roll33);
        br34=(CardView) findViewById(R.id.roll34);
        br35=(CardView) findViewById(R.id.roll35);
        br36=(CardView) findViewById(R.id.roll36);
        br40=(CardView) findViewById(R.id.roll40);
        br41=(CardView) findViewById(R.id.roll41);
        br42=(CardView) findViewById(R.id.roll42);
        br43=(CardView) findViewById(R.id.roll43);

        br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentroll1=new Intent(DuplicateMainActivity.this,Actitvity2.class);
                startActivity(intentroll1);

            }
        });

        br2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentroll2=new Intent(DuplicateMainActivity.this,Activity3.class);
                startActivity(intentroll2);
            }
        });

        br3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentroll3=new Intent(DuplicateMainActivity.this,Acticity4.class);
                startActivity(intentroll3);
            }
        });

        br4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent   intentroll4 = new Intent(DuplicateMainActivity.this,Acitivity5.class);
                startActivity(intentroll4);
            }
        });

        br5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll5= new Intent(DuplicateMainActivity.this,Activity6.class);
                startActivity(intentroll5);
            }
        });


        br6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll6= new Intent(DuplicateMainActivity.this,Activity7.class);
                startActivity(intentroll6);
            }
        });

        br7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll7= new Intent(DuplicateMainActivity.this,Activity8.class);
                startActivity(intentroll7);
            }
        });

        br8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll8= new Intent(DuplicateMainActivity.this,Activity9.class);
                startActivity(intentroll8);
            }
        });



        br9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll9= new Intent(DuplicateMainActivity.this,Activity10.class);
                startActivity(intentroll9);
            }
        });



        br10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll10= new Intent(DuplicateMainActivity.this,Activity11.class);
                startActivity(intentroll10);
            }
        });

        br11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll11= new Intent(DuplicateMainActivity.this,Activity12.class);
                startActivity(intentroll11);
            }
        });

        br12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll12= new Intent(DuplicateMainActivity.this,Activity13.class);
                startActivity(intentroll12);
            }
        });

        br13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll13= new Intent(DuplicateMainActivity.this,Activity14.class);
                startActivity(intentroll13);
            }
        });

        br14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll14= new Intent(DuplicateMainActivity.this,Activity15.class);
                startActivity(intentroll14);
            }
        });


        br15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll15= new Intent(DuplicateMainActivity.this,Activity16.class);
                startActivity(intentroll15);
            }
        });

        br16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll16= new Intent(DuplicateMainActivity.this,Activity17.class);
                startActivity(intentroll16);
            }
        });

        br17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll17= new Intent(DuplicateMainActivity.this,Activity18.class);
                startActivity(intentroll17);
            }
        });
        br18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll18= new Intent(DuplicateMainActivity.this,Activity19.class);
                startActivity(intentroll18);
            }
        });
        br19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll19= new Intent(DuplicateMainActivity.this,Activity20.class);
                startActivity(intentroll19);
            }
        });


        br20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll20= new Intent(DuplicateMainActivity.this,Activity21.class);
                startActivity(intentroll20);
            }
        });

        br21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll21= new Intent(DuplicateMainActivity.this,Activity22.class);
                startActivity(intentroll21);
            }
        });

        br22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll22= new Intent(DuplicateMainActivity.this,Activity23.class);
                startActivity(intentroll22);
            }
        });

        br23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll23= new Intent(DuplicateMainActivity.this,Activity24.class);
                startActivity(intentroll23);
            }
        });

        br24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll24= new Intent(DuplicateMainActivity.this,Activity25.class);
                startActivity(intentroll24);
            }
        });
        br25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll25= new Intent(DuplicateMainActivity.this,Activity26.class);
                startActivity(intentroll25);
            }
        });
        br26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll26= new Intent(DuplicateMainActivity.this,Activity27.class);
                startActivity(intentroll26);
            }
        });

        br27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll27= new Intent(DuplicateMainActivity.this,Activity28.class);
                startActivity(intentroll27);
            }
        });

        br28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll28= new Intent(DuplicateMainActivity.this,Activity29.class);
                startActivity(intentroll28);
            }
        });


        br29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll29= new Intent(DuplicateMainActivity.this,Activity30.class);
                startActivity(intentroll29);
            }
        });


        br30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll30= new Intent(DuplicateMainActivity.this,Activity31.class);
                startActivity(intentroll30);
            }
        });

        br31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll31= new Intent(DuplicateMainActivity.this,Activity32.class);
                startActivity(intentroll31);
            }
        });

        br32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll32= new Intent(DuplicateMainActivity.this,Activity33.class);
                startActivity(intentroll32);
            }
        });



        br33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll33= new Intent(DuplicateMainActivity.this,Activity34.class);
                startActivity(intentroll33);
            }
        });


        br34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll34= new Intent(DuplicateMainActivity.this,Activity35.class);
                startActivity(intentroll34);
            }
        });


        br35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll35= new Intent(DuplicateMainActivity.this,Activity36.class);
                startActivity(intentroll35);
            }
        });
        br36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll36= new Intent(DuplicateMainActivity.this,Activity37.class);
                startActivity(intentroll36);
            }
        });

        br40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll40= new Intent(DuplicateMainActivity.this,Activity41.class);
                startActivity(intentroll40);
            }
        });

        br41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll41= new Intent(DuplicateMainActivity.this,Activity42.class);
                startActivity(intentroll41);
            }
        });

        br42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll42= new Intent(DuplicateMainActivity.this,Activity43.class);
                startActivity(intentroll42);
            }
        });


        br43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intentroll43= new Intent(DuplicateMainActivity.this,Activity44.class);
                startActivity(intentroll43);
            }
        });

























    }
}
