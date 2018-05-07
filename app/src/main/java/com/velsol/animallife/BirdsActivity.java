package com.velsol.animallife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BirdsActivity extends AppCompatActivity
{
    ImageView leftBirds,rightBirds,labelBirds;
    TextView labelButton,labelBirdsName;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);
        leftBirds=(ImageView)findViewById(R.id.left_bird);
        labelBirds=(ImageView)findViewById(R.id.image_show_birds);
        rightBirds=(ImageView)findViewById(R.id.right_bird);
        labelButton=(TextView)findViewById(R.id.description_label_bird);
        labelBirdsName=(TextView)findViewById(R.id.birds_name);
        labelBirds.setImageResource(R.drawable.apple);
        labelBirdsName.setText("Apple");
        leftBirds.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //decrease the count vbalues
                decreaseBirds();

            }
        });
        rightBirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //increase the count values..
                rightArrows();

            }
        });

    }
    public void decreaseBirds()
    {
        count--;
        if (count<0)
        {
            Toast.makeText(this, "no images found", Toast.LENGTH_SHORT).show();
            labelBirds.setImageResource(R.drawable.apple);
            labelBirds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                    intent.putExtra("image_url",0);
                    startActivity(intent);
                }
            });
            labelBirdsName.setText("Apple");
            leftBirds.setVisibility(View.GONE);
        }
        else
        {
            leftBirds.setVisibility(View.VISIBLE);
            switch (count)
            {
                case 1:
                {
                    labelBirds.setImageResource(R.drawable.beetroot);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",1);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Beet Root");
                    break;
                }
                case 2:
                {
                    labelBirds.setImageResource(R.drawable.carrot);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",2);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Carrot");
                    break;
                }
                case 3:
                {
                    labelBirds.setImageResource(R.drawable.dates);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",3);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Dates");
                    break;
                }
                case 4:
                {
                    labelBirds.setImageResource(R.drawable.eggplant);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",4);
                            startActivity(intent);
                        }
                    });

                    labelBirdsName.setText("Eggplant");
                    break;
                }
                case 5:
                {
                    labelBirds.setImageResource(R.drawable.fig);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",5);
                            startActivity(intent);
                        }
                    });

                    labelBirdsName.setText("Fig");
                    break;
                }
                case 6:
                {
                    labelBirds.setImageResource(R.drawable.grapes);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",6);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Grapes");
                    break;
                }
                case 7:
                {
                    labelBirds.setImageResource(R.drawable.honeydew);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",7);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("HoneyDew");
                    break;
                }
                case 8:
                {
                    labelBirds.setImageResource(R.drawable.indianprune);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",8);
                            startActivity(intent);
                        }
                    });

                    labelBirdsName.setText("indianprune");
                    break;
                }
                case 9:
                {
                    labelBirds.setImageResource(R.drawable.jackfruit);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",9);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Jack fruit");
                    break;
                }
                case 10:
                {
                    labelBirds.setImageResource(R.drawable.kiwifruit);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",10);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("kiwifruit");
                    break;
                }
                default:
                    break;
            }
        }
    }
    public void rightArrows()
    {
        leftBirds.setVisibility(View.VISIBLE);
        count++;
        switch (count)
        {
            case 1:
            {
                labelBirds.setImageResource(R.drawable.beetroot);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",1);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Beet Root");
                break;
            }
            case 2:
            {
                labelBirds.setImageResource(R.drawable.carrot);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",2);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Carrot");
                break;
            }
            case 3:
            {
                labelBirds.setImageResource(R.drawable.dates);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",3);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Dates");
                break;
            }
            case 4:
            {
                labelBirds.setImageResource(R.drawable.eggplant);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",4);
                        startActivity(intent);
                    }
                });

                labelBirdsName.setText("Eggplant");
                break;
            }
            case 5:
            {
                labelBirds.setImageResource(R.drawable.fig);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",5);
                        startActivity(intent);
                    }
                });

                labelBirdsName.setText("Fig");
                break;
            }
            case 6:
            {
                labelBirds.setImageResource(R.drawable.grapes);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",6);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Grapes");
                break;
            }
            case 7:
            {
                labelBirds.setImageResource(R.drawable.honeydew);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",7);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("HoneyDew");
                break;
            }
            case 8:
            {
                labelBirds.setImageResource(R.drawable.indianprune);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",8);
                        startActivity(intent);
                    }
                });

                labelBirdsName.setText("indianprune");
                break;
            }
            case 9:
            {
                labelBirds.setImageResource(R.drawable.jackfruit);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",9);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Jack fruit");
                break;
            }
            case 10:
            {
                labelBirds.setImageResource(R.drawable.kiwifruit);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",10);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("kiwifruit");
                break;
            }
            default:
                break;
        }
    }
}
