package com.velsol.animallife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalActivity extends AppCompatActivity
{
    ImageView left,right,mImageDisplay;
    TextView description;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        left=(ImageView)findViewById(R.id.left);
        right=(ImageView)findViewById(R.id.right);
        mImageDisplay=(ImageView)findViewById(R.id.image_show);
        description=(TextView)findViewById(R.id.description_label);
        mImageDisplay.setImageResource(R.drawable.alligator);
        description.setText("alligator text is started");
               left.setOnClickListener(new View.OnClickListener()
               {
                   @Override
                   public void onClick(View view)
                   {
                    //left button related calling
                       leftCallings();
                   }
               });
               right.setOnClickListener(new View.OnClickListener()
               {
                   @Override
                   public void onClick(View view)
                   {
                       //right related callings
                       righArrowCalls();
                   }
               });
    }
    public void leftCallings()
    {
        count--;
    }
    public void righArrowCalls()
    {
        count++;
        switch (count)
        {
            case 1:
            {

            }
        }
    }
}
