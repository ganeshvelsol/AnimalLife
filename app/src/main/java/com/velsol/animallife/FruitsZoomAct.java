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
            case 11:
            {
                frootsShow.setImageResource(R.drawable.lemon);
                break;
            }
            case 12:
            {
                frootsShow.setImageResource(R.drawable.mango);
                break;
            }
            case 13:
            {
                frootsShow.setImageResource(R.drawable.nectarine);
                break;
            }
            case 14:
            {
                frootsShow.setImageResource(R.drawable.olive);
                break;
            }
            case 15:
            {
                frootsShow.setImageResource(R.drawable.papaya);
                break;
            }
            case 16:
            {
                frootsShow.setImageResource(R.drawable.quince);
                break;
            }
            case 17:
            {
                frootsShow.setImageResource(R.drawable.raspberry);
                break;
            }
            case 18:
            {
                frootsShow.setImageResource(R.drawable.sweetpotato);
                break;
            }
            case 19:
            {
                frootsShow.setImageResource(R.drawable.tomato);
                break;
            }
            case 20:
            {
                frootsShow.setImageResource(R.drawable.uglyfroot);
                break;
            }
            case 21:
            {
                frootsShow.setImageResource(R.drawable.valencia);
                break;
            }
            case 22:
            {
                frootsShow.setImageResource(R.drawable.walnut);
                break;
            }
            case 23:
            {
                frootsShow.setImageResource(R.drawable.xigua);
                break;
            }
            case 24:
            {
                frootsShow.setImageResource(R.drawable.yambean);
                break;
            }
            case 25:
            {
                frootsShow.setImageResource(R.drawable.zucchini);
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
