package com.velsol.animallife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FruitsZoomAct extends AppCompatActivity
{
    ImageView frootsShow;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_zoom);
        frootsShow=(ImageView)findViewById(R.id.fruits_show);
        Bundle b=getIntent().getExtras();
        int mm=b.getInt("image_url");
        switch (mm)
        {
            case 0:
            {
                frootsShow.setImageResource(R.drawable.apple);
                break;
            }
            case 1:
            {
                frootsShow.setImageResource(R.drawable.beetroot);
                break;
            }
            case 2:
            {
                frootsShow.setImageResource(R.drawable.carrot);
                break;
            }
            case 3:
            {
                frootsShow.setImageResource(R.drawable.dates);
                break;
            }
            case 4:
            {
                frootsShow.setImageResource(R.drawable.eggplant);
                break;
            }
            case 5:
            {
                frootsShow.setImageResource(R.drawable.fig);
                break;
            }
            case 6:
            {
                frootsShow.setImageResource(R.drawable.grapes);
                break;
            }
            case 7:
            {
                frootsShow.setImageResource(R.drawable.honeydew);
                break;
            }
            case 8:
            {
                frootsShow.setImageResource(R.drawable.indianprune);
                break;
            }
            case 9:
            {
                frootsShow.setImageResource(R.drawable.jackfruit);
                break;
            }
            case 10:
            {
                frootsShow.setImageResource(R.drawable.kiwifruit);
                break;
            }
            default:
                break;
        }
        frootsShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                onBackPressed();
            }
        });
    }
}
