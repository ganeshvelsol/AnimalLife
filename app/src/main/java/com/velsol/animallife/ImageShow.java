package com.velsol.animallife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageShow extends AppCompatActivity
{
    ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
            default:
                break;
        }
    }
}
