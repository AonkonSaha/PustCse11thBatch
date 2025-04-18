package com.ankon.latest_cse11th_batch;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import androidx.appcompat.app.AppCompatActivity;

public class Activitypicture extends AppCompatActivity {

    SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitypicture);

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.DROP); //set indicator animation by using SliderLayout.Animations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout.setScrollTimeInSec(3); //set scroll delay in seconds :

        setSliderViews();
    }


    private void setSliderViews() {

        for (int i = 0; i <= 6; i++) {

            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.samimpic);
                    sliderView.setDescription("1ST SEMISTER 1st CR");

                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.raihanpic);
                    sliderView.setDescription("1ST SEMISTER CR2");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.gpic);
                    sliderView.setDescription("AFTER\n1st Semister\nFinal Voice");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.one);
                    sliderView.setDescription("Aonkon Saha");

                    break;

                case 4:
                    sliderView.setImageDrawable(R.drawable.boigorpic);
                    sliderView.setDescription("Boigor...");

                    break;
                case 5:
                    sliderView.setImageDrawable(R.drawable.boigorpic2);
                    sliderView.setDescription("Boigor...");

                    break;
                case 6:
                    sliderView.setImageDrawable(R.drawable.boigorpic3);
                    sliderView.setDescription("Boigor...");

                    break;

                case 7:
                    sliderView.setImageDrawable(R.drawable.boigor4);
                    sliderView.setDescription("Boigor...");

                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            //erView.setDescription("setDescription " + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(Activitypicture.this, "Picture Number " + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });

            //at last add this view in your layout :
            sliderLayout.addSliderView(sliderView);
        }


    }

}
