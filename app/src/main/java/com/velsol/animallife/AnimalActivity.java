package com.velsol.animallife;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalActivity extends AppCompatActivity
{
    ImageView left,right,mImageDisplay;
    TextView description,animalNames;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        animalNames=(TextView)findViewById(R.id.animal_name);
        left=(ImageView)findViewById(R.id.left);
        right=(ImageView)findViewById(R.id.right);
        mImageDisplay=(ImageView)findViewById(R.id.image_show);
        description=(TextView)findViewById(R.id.description_label);
        mImageDisplay.setImageResource(R.drawable.alligator);
        animalNames.setText("Alligator");
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
        if (count<0)
        {
            Toast.makeText(this, "no images found", Toast.LENGTH_SHORT).show();
            mImageDisplay.setImageResource(R.drawable.alligator);
            animalNames.setText("Alligator");
            left.setVisibility(View.GONE);
        }
        else
        {
            left.setVisibility(View.VISIBLE);
            switch (count)
            {
                case 1:
                {
                    mImageDisplay.setImageResource(R.drawable.bear);
                    animalNames.setText("Bear");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",1);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 2:
                {
                    mImageDisplay.setImageResource(R.drawable.crab);
                    animalNames.setText("Crab");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",2);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 3:
                {
                    mImageDisplay.setImageResource(R.drawable.donkey);
                    animalNames.setText("donkey");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",3);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 4:
                {
                    mImageDisplay.setImageResource(R.drawable.elephant);
                    animalNames.setText("Elephant");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",4);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 5:
                {
                    mImageDisplay.setImageResource(R.drawable.flamingo);
                    animalNames.setText("Flamingo");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",5);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 6:
                {
                    mImageDisplay.setImageResource(R.drawable.girafee);
                    animalNames.setText("Girafee");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",6);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 7:
                {
                    mImageDisplay.setImageResource(R.drawable.hippopotamus);
                    animalNames.setText("Hippopotamous");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",7);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 8:
                {
                    mImageDisplay.setImageResource(R.drawable.iguana);
                    animalNames.setText("iguana");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",8);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 9:
                {
                    mImageDisplay.setImageResource(R.drawable.jaguar);
                    animalNames.setText("Jaguar");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",9);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 10:
                {
                    mImageDisplay.setImageResource(R.drawable.kangaroo);
                    animalNames.setText("Kangaroo");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",10);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 11:
                {
                    mImageDisplay.setImageResource(R.drawable.lion);
                    animalNames.setText("Lion");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",11);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 12:
                {
                    mImageDisplay.setImageResource(R.drawable.macaw);
                    animalNames.setText("Macaw");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",12);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 13:
                {
                    mImageDisplay.setImageResource(R.drawable.newt);
                    animalNames.setText("Newt");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",13);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 14:
                {
                    mImageDisplay.setImageResource(R.drawable.ostrich);
                    animalNames.setText("Ostrich");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",14);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 15:
                {
                    mImageDisplay.setImageResource(R.drawable.pig);
                    animalNames.setText("Pig");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",15);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 16:
                {
                    mImageDisplay.setImageResource(R.drawable.quail);
                    animalNames.setText("Quail");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",16);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 17:
                {
                    mImageDisplay.setImageResource(R.drawable.rat);
                    animalNames.setText("Rat");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",17);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 18:
                {
                    mImageDisplay.setImageResource(R.drawable.sheep);
                    animalNames.setText("Sheep");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",18);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 19:
                {
                    mImageDisplay.setImageResource(R.drawable.tiger);
                    animalNames.setText("Tiger");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",19);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 20:
                {
                    mImageDisplay.setImageResource(R.drawable.urial);
                    animalNames.setText("Urial");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",20);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 21:
                {
                    mImageDisplay.setImageResource(R.drawable.wolf);
                    animalNames.setText("Wolf");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",21);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 22:
                {
                    mImageDisplay.setImageResource(R.drawable.xerus);
                    animalNames.setText("Xerus");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",22);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 23:
                {
                    mImageDisplay.setImageResource(R.drawable.yak);
                    animalNames.setText("Yak");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",23);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                case 24:
                {
                    mImageDisplay.setImageResource(R.drawable.zebra);
                    animalNames.setText("Zebra");
                    mImageDisplay.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                            intent.putExtra("image_url",24);
                            startActivity(intent);
                        }
                    });
                    break;
                }
                default:
                    Toast.makeText(this, "completed", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void righArrowCalls()
    {
        left.setVisibility(View.VISIBLE);
        count++;
        switch (count)
        {
            case 1:
            {
                mImageDisplay.setImageResource(R.drawable.bear);
                animalNames.setText("Bear");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",1);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 2:
            {
                mImageDisplay.setImageResource(R.drawable.crab);
                animalNames.setText("Crab");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",2);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 3:
            {
                mImageDisplay.setImageResource(R.drawable.donkey);
                animalNames.setText("Donkey");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",3);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 4:
            {
                mImageDisplay.setImageResource(R.drawable.elephant);
                animalNames.setText("Elephant");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",4);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 5:
            {
                mImageDisplay.setImageResource(R.drawable.flamingo);
                animalNames.setText("Flamingo");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",5);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 6:
            {
                mImageDisplay.setImageResource(R.drawable.girafee);
                animalNames.setText("Girafee");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",6);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 7:
            {
                mImageDisplay.setImageResource(R.drawable.hippopotamus);
                animalNames.setText("Hippopotamus");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",7);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 8:
            {
                mImageDisplay.setImageResource(R.drawable.iguana);
                animalNames.setText("Iguana");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",8);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 9:
            {
                mImageDisplay.setImageResource(R.drawable.jaguar);
                animalNames.setText("Jaguar");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",9);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 10:
            {
                mImageDisplay.setImageResource(R.drawable.kangaroo);
                animalNames.setText("Kangaroo");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",10);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 11:
            {
                mImageDisplay.setImageResource(R.drawable.lion);
                animalNames.setText("Lion");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",11);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 12:
            {
                mImageDisplay.setImageResource(R.drawable.macaw);
                animalNames.setText("Macaw");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",12);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 13:
            {
                mImageDisplay.setImageResource(R.drawable.newt);
                animalNames.setText("Newt");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",13);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 14:
            {
                mImageDisplay.setImageResource(R.drawable.ostrich);
                animalNames.setText("Ostrich");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",14);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 15:
            {
                mImageDisplay.setImageResource(R.drawable.pig);
                animalNames.setText("Pig");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",15);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 16:
            {
                mImageDisplay.setImageResource(R.drawable.quail);
                animalNames.setText("Quail");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",16);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 17:
            {
                mImageDisplay.setImageResource(R.drawable.rat);
                animalNames.setText("Rat");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",17);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 18:
            {
                mImageDisplay.setImageResource(R.drawable.sheep);
                animalNames.setText("Sheep");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",18);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 19:
            {
                mImageDisplay.setImageResource(R.drawable.tiger);
                animalNames.setText("Tiger");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",19);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 20:
            {
                mImageDisplay.setImageResource(R.drawable.urial);
                animalNames.setText("Urial");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",20);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 21:
            {
                mImageDisplay.setImageResource(R.drawable.wolf);
                animalNames.setText("Wolf");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",21);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 22:
            {
                mImageDisplay.setImageResource(R.drawable.xerus);
                animalNames.setText("Xerus");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",22);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 23:
            {
                mImageDisplay.setImageResource(R.drawable.yak);
                animalNames.setText("Yak");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",23);
                        startActivity(intent);
                    }
                });
                break;
            }
            case 24:
            {
                mImageDisplay.setImageResource(R.drawable.zebra);
                animalNames.setText("Zebra");
                mImageDisplay.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                        intent.putExtra("image_url",24);
                        startActivity(intent);
                    }
                });
                break;
            }
            default:
                Toast.makeText(this, "No Images found..", Toast.LENGTH_SHORT).show();
        }
    }
}
