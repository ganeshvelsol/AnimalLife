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
    TextView description;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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
        if (count<0)
        {
            Toast.makeText(this, "no images found", Toast.LENGTH_SHORT).show();
            mImageDisplay.setImageResource(R.drawable.alligator);
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
                    mImageDisplay.setImageResource(R.drawable.newt);;
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
                mImageDisplay.setImageResource(R.drawable.newt);;
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
