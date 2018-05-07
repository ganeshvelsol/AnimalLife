package com.velsol.animallife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageShow extends AppCompatActivity
{
    ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_show);
        mImage=(ImageView)findViewById(R.id.image_full);
        Bundle b=getIntent().getExtras();
        int mm=b.getInt("image_url");
        switch (mm)
        {
            case 1:
            {
                mImage.setImageResource(R.drawable.bear);
                break;
            }
            case 2:
            {
                mImage.setImageResource(R.drawable.crab);
                break;
            }
            case 3:
            {
                mImage.setImageResource(R.drawable.donkey);
                break;
            }
            case 4:
            {
                mImage.setImageResource(R.drawable.elephant);
                break;
            }
            case 5:
            {
                mImage.setImageResource(R.drawable.flamingo);
                break;
            }
            case 6:
            {
                mImage.setImageResource(R.drawable.girafee);
                break;
            }
            case 7:
            {
                mImage.setImageResource(R.drawable.hippopotamus);
                break;
            }
            case 8:
            {
                mImage.setImageResource(R.drawable.iguana);
                break;
            }
            case 9:
            {
                mImage.setImageResource(R.drawable.jaguar);
                break;
            }
            case 10:
            {
                mImage.setImageResource(R.drawable.kangaroo);
                break;
            }
            case 11:
            {
                mImage.setImageResource(R.drawable.lion);
                break;
            }
            case 12:
            {
                mImage.setImageResource(R.drawable.macaw);
                break;
            }
            case 13:
            {
                mImage.setImageResource(R.drawable.newt);
                break;
            }
            case 14:
            {
                mImage.setImageResource(R.drawable.ostrich);
                break;
            }
            case 15:
            {
                mImage.setImageResource(R.drawable.pig);
                break;
            }
            case 16:
            {
                mImage.setImageResource(R.drawable.quail);
                break;
            }
            case 17:
            {
                mImage.setImageResource(R.drawable.rat);
                break;
            }
            case 18:
            {
                mImage.setImageResource(R.drawable.sheep);
                break;
            }
            case 19:
            {
                mImage.setImageResource(R.drawable.tiger);
                break;
            }
            case 20:
            {
                mImage.setImageResource(R.drawable.urial);
                break;
            }
            case 21:
            {
                mImage.setImageResource(R.drawable.wolf);
                break;
            }
            case 22:
            {
                mImage.setImageResource(R.drawable.xerus);
                break;
            }
            case 23:
            {
                mImage.setImageResource(R.drawable.yak);
                break;
            }
            case 24:
            {
                mImage.setImageResource(R.drawable.zebra);
                break;
            }
            default:
                break;
        }
        mImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onBackPressed();
            }
        });
    }
}
