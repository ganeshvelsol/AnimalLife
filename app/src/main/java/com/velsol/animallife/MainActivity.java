package com.velsol.animallife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    CardView mcardAnimals,mcardFruits;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcardAnimals=(CardView)findViewById(R.id.all_animals);
        mcardFruits=(CardView)findViewById(R.id.all_fruits);
        mcardAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //call animals relative activity
                startActivity(new Intent(MainActivity.this,AnimalActivity.class));
            }
        });
        mcardFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //call fruits related activity
                startActivity(new Intent(MainActivity.this,BirdsActivity.class));

            }
        });
    }
}
