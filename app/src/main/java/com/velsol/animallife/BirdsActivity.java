package com.velsol.animallife;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        leftBirds=(ImageView)findViewById(R.id.left_bird);
        labelBirds=(ImageView)findViewById(R.id.image_show_birds);
        rightBirds=(ImageView)findViewById(R.id.right_bird);
        labelButton=(TextView)findViewById(R.id.description_label_bird);
        labelBirdsName=(TextView)findViewById(R.id.birds_name);
        labelBirds.setImageResource(R.drawable.apple);
        labelBirds.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                intent.putExtra("image_url",99);
                startActivity(intent);
            }
        });
        labelBirdsName.setText("Apple");
        Spannable word = new SpannableString("As one of the most cultivated and consumed fruits in the world, apples are continuously being praised as a \n miracle food\n");
        word.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        labelButton.setText(word);

        Spannable word1 = new SpannableString("\n Benefits Are:");
        word1.setSpan(new ForegroundColorSpan(Color.RED), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        labelButton.append(word1);

        labelButton.append("\n Improving neurological health");
        labelButton.append("\n Preventing dementia");
        labelButton.append("\n Reducing your risk of stroke");
        labelButton.append("\n Lowering levels of bad cholesterol");
        leftBirds.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //decrease the count vbalues
                decreaseBirds();

            }
        });
        rightBirds.setOnClickListener(new View.OnClickListener()
        {
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
            labelBirds.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                    intent.putExtra("image_url",0);
                    startActivity(intent);
                }
            });
            labelBirdsName.setText("Apple");
            //adding texts with different colors
            Spannable word = new SpannableString("As one of the most cultivated and consumed fruits in the world, apples are continuously being praised as a \n miracle food\n");
            word.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            labelButton.setText(word);

            Spannable word1 = new SpannableString("\n Benefits Are:");
            word1.setSpan(new ForegroundColorSpan(Color.RED), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            labelButton.append(word1);

            labelButton.append("\n Improving neurological health");
            labelButton.append("\n Preventing dementia");
            labelButton.append("\n Reducing your risk of stroke");
            labelButton.append("\n Lowering levels of bad cholesterol");
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
                    labelBirds.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",1);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Beet Root");
                    labelButton.setText("Touted as one of the healthiest veggies. The beetroot is the taproot portion of the beet plant. It is one of the many varieties of the genus Beta vulgaris, all of which are mostly grown for their edible taproots and leaves. Apart from being used as food, beetroot is also used as a medicinal plant and as a food colorant.\n" + "\n" +
                            "Right from the Middle Ages, beetroot has been used not just as food, but also as a treatment for numerous conditions. Popularly known as beet, the vegetable is called Chukandar in Hindi, Remolachas in Spanish, and Hong cai tou in Chinese. And back in the Indian households, beets have been used for a long time as a treatment for anemia.");
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
                    labelButton.setText("Carrots are one of the most widely used and enjoyed vegetables in the world, partly because they grow relatively easily and are very versatile in a number of dishes and cultural cuisines\n The type of carrot most commonly eaten around the world is the domesticated variety of the wild species named above and it is native to Europe and Southwestern Asia.\n  The majority of carrots are now cultivated in China, but they are exported throughout the world to be included in salads and soups, as well as a stand-alone vegetable for snacks, side dishes, and essential ingredients in many recipes.");
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
                    labelButton.setText("The benefits of dates include relief from constipation, intestinal disorders, heart problems, anemia, sexual dysfunctions, diarrhea, abdominal cancer, and many other conditions. Dates also help for a healthy weight gain. \n They are rich in several vitamins, minerals, and fiber. These delicious fruits contain oil, calcium, sulfur, iron, potassium, phosphorous, manganese, copper and magnesium, which are all beneficial for health.\n Some health specialists have said that eating one date per day is necessary for a balanced and healthy diet. ");
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
                    labelButton.setText("Eggplants are fruits, originally native to the Indian subcontinent and are now found throughout the world in different cuisines. \n In England, they are known as “aubergine”, and are also called brinjal \n Eggplant is known as a vegetable having a unique range of health benefits, including an ability to help build strong bones and prevent osteoporosis, reduce the symptoms of anemia, and increase cognition.\n  It improves cardiovascular health and protects the digestive system. Eggplant is also good for weight loss, managing diabetes, reducing stress, protecting infants from birth defects, and even preventing cancer.");
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
                    labelButton.setText(" The health benefits of figs come from the presence of minerals, vitamins, and fiber contained in the fruits. They contain a wealth of beneficial nutrients, including vitamin A, vitamin B1, vitamin B2, calcium, iron, phosphorus, manganese, sodium, potassium, and chlorine.\n The health benefits of figs or anjeer include the fruits’ use in the treatment of sexual dysfunction, constipation, indigestion, piles, diabetes, cough, bronchitis, and asthma. Figs are also used as a quick and healthy way to gain weight after suffering from an illness.\n" +
                            "\n" +
                            "The fig tree is a member of the mulberry family, usually found in Asia. The dried form of fig is available almost everywhere, all year round.");
                    break;
                }
                case 6:
                {
                    labelBirds.setImageResource(R.drawable.grapes);
                    labelBirds.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",6);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Grapes");
                    labelButton.setText("1. Provides Protection Against Sunburns\n" + "2. Reverses Aging\n" + "3. Makes Skin Supple\n" + "4. Combats Uneven Skin Tone\n" +
                            "5. Helps Lighten Scars \n 6. Fights Breast Cancer\n" + "7. Prevents Eye Degeneration\n" + "8. Treats Diabetes\n" + "9. Lowers Cholesterol In Blood\n" +
                            "10. Heals Kidney Disorders\n" + "11. Relieves Asthma\n" + "12. Helps Fighting Viral Infections\n" + "13. Relieves Constipation");
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
                    labelButton.setText(" A good addition to your healthy meal plan, honeydew melon is a member of the melon family.\n It is usually round in shape with a pale green flesh. Cultivated in semiarid regions, its juicy and sweet flesh is commonly incorporated in salads.\n" +
                            "\n" +
                            "Aside from its smooth and lightly colored peel and delicious flesh, this fruit is also packed with loads of nutrients.\n" +
                            "t is also a good source of vitamin B complex more particularly thiamin (B1), niacin (B3), pantothenic (B5), and pyridoxine (B6). Thiamine plays a vital role in the production of new cells as well as in the protection of the immune system. Niacin, meanwhile, heightens the good cholesterol, which is crucial to lessen bad cholesterol in the blood");
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
                    labelButton.setText("he fruit has been used to treat haemoptysis, vaginal and menstrual problems, rheumatoid problems,\n and has been issued as a purgative and demulcent. Green fruits have been used as a diuretic");
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
                    labelButton.setText("1. Helps to get a glowing complexion \n 2. High in protein \n 3. Promotes hair growth \n 4. Vitamin A \n 4. Energy \n" +
                            "5. Prevents cancer");
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
                    labelButton.setText("Kiwi is no ordinary fruit, both in terms of the way it looks as well as its nutritional content.\n The vibrant green slices specked with little black seeds have always worked wonders in sprucing up desserts and fruit bowls.\n  It is a sight for the eyes and the refreshing flavour makes it a favoured choice among fruits.");
                    break;
                }
                case 11:
                {
                    labelBirds.setImageResource(R.drawable.lemon);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",11);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Lemon");
                    labelButton.setText("");
                    break;
                }
                case 12:
                {
                    labelBirds.setImageResource(R.drawable.mango);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",12);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Mango");
                    break;
                }
                case 13:
                {
                    labelBirds.setImageResource(R.drawable.nectarine);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",13);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Nectarine");
                    break;
                }
                case 14:
                {
                    labelBirds.setImageResource(R.drawable.olive);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",14);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Olive");
                    break;
                }
                case 15:
                {
                    labelBirds.setImageResource(R.drawable.papaya);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",15);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Papaya");
                    break;
                }
                case 16:
                {
                    labelBirds.setImageResource(R.drawable.quince);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",16);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Quince");
                    break;
                }
                case 17:
                {
                    labelBirds.setImageResource(R.drawable.raspberry);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",17);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Raspberry");
                    break;
                }
                case 18:
                {
                    labelBirds.setImageResource(R.drawable.sweetpotato);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",18);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Sweet Potato");
                    break;
                }
                case 19:
                {
                    labelBirds.setImageResource(R.drawable.tomato);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",19);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Tomato");
                    break;
                }
                case 20:
                {
                    labelBirds.setImageResource(R.drawable.uglyfroot);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",20);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("UglyFruit");
                    break;
                }
                case 21:
                {
                    labelBirds.setImageResource(R.drawable.valencia);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",21);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Valencia");
                    break;
                }
                case 22:
                {
                    labelBirds.setImageResource(R.drawable.walnut);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",22);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Walnut");
                    break;
                }
                case 23:
                {
                    labelBirds.setImageResource(R.drawable.xigua);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",23);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Xigua");
                    break;
                }
                case 24:
                {
                    labelBirds.setImageResource(R.drawable.yambean);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",24);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Yambean");
                    break;
                }
                case 25:
                {
                    labelBirds.setImageResource(R.drawable.zucchini);
                    labelBirds.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                            intent.putExtra("image_url",25);
                            startActivity(intent);
                        }
                    });
                    labelBirdsName.setText("Zucchini");
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
                labelButton.setText("Touted as one of the healthiest veggies. The beetroot is the taproot portion of the beet plant. It is one of the many varieties of the genus Beta vulgaris, all of which are mostly grown for their edible taproots and leaves. Apart from being used as food, beetroot is also used as a medicinal plant and as a food colorant.\n" + "\n" +
                        "Right from the Middle Ages, beetroot has been used not just as food, but also as a treatment for numerous conditions. Popularly known as beet, the vegetable is called Chukandar in Hindi, Remolachas in Spanish, and Hong cai tou in Chinese. And back in the Indian households, beets have been used for a long time as a treatment for anemia.");
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
                labelButton.setText("Carrots are one of the most widely used and enjoyed vegetables in the world, partly because they grow relatively easily and are very versatile in a number of dishes and cultural cuisines\n The type of carrot most commonly eaten around the world is the domesticated variety of the wild species named above and it is native to Europe and Southwestern Asia.\n  The majority of carrots are now cultivated in China, but they are exported throughout the world to be included in salads and soups, as well as a stand-alone vegetable for snacks, side dishes, and essential ingredients in many recipes.");
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
                labelButton.setText("The benefits of dates include relief from constipation, intestinal disorders, heart problems, anemia, sexual dysfunctions, diarrhea, abdominal cancer, and many other conditions. Dates also help for a healthy weight gain. \n They are rich in several vitamins, minerals, and fiber. These delicious fruits contain oil, calcium, sulfur, iron, potassium, phosphorous, manganese, copper and magnesium, which are all beneficial for health.\n Some health specialists have said that eating one date per day is necessary for a balanced and healthy diet. ");
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
                labelButton.setText("Eggplants are fruits, originally native to the Indian subcontinent and are now found throughout the world in different cuisines. \n In England, they are known as “aubergine”, and are also called brinjal \n Eggplant is known as a vegetable having a unique range of health benefits, including an ability to help build strong bones and prevent osteoporosis, reduce the symptoms of anemia, and increase cognition.\n  It improves cardiovascular health and protects the digestive system. Eggplant is also good for weight loss, managing diabetes, reducing stress, protecting infants from birth defects, and even preventing cancer.");
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
                labelButton.setText(" The health benefits of figs come from the presence of minerals, vitamins, and fiber contained in the fruits. They contain a wealth of beneficial nutrients, including vitamin A, vitamin B1, vitamin B2, calcium, iron, phosphorus, manganese, sodium, potassium, and chlorine.\n The health benefits of figs or anjeer include the fruits’ use in the treatment of sexual dysfunction, constipation, indigestion, piles, diabetes, cough, bronchitis, and asthma. Figs are also used as a quick and healthy way to gain weight after suffering from an illness.\n" +
                        "\n" +
                        "The fig tree is a member of the mulberry family, usually found in Asia. The dried form of fig is available almost everywhere, all year round.");
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
                labelButton.setText("1. Provides Protection Against Sunburns\n" + "2. Reverses Aging\n" + "3. Makes Skin Supple\n" + "4. Combats Uneven Skin Tone\n" +
                        "5. Helps Lighten Scars \n 6. Fights Breast Cancer\n" + "7. Prevents Eye Degeneration\n" + "8. Treats Diabetes\n" + "9. Lowers Cholesterol In Blood\n" +
                        "10. Heals Kidney Disorders\n" + "11. Relieves Asthma\n" + "12. Helps Fighting Viral Infections\n" + "13. Relieves Constipation");
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
                labelButton.setText(" A good addition to your healthy meal plan, honeydew melon is a member of the melon family.\n It is usually round in shape with a pale green flesh. Cultivated in semiarid regions, its juicy and sweet flesh is commonly incorporated in salads.\n" +
                        "\n" +
                        "Aside from its smooth and lightly colored peel and delicious flesh, this fruit is also packed with loads of nutrients.\n" +
                        "t is also a good source of vitamin B complex more particularly thiamin (B1), niacin (B3), pantothenic (B5), and pyridoxine (B6). Thiamine plays a vital role in the production of new cells as well as in the protection of the immune system. Niacin, meanwhile, heightens the good cholesterol, which is crucial to lessen bad cholesterol in the blood");
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
                labelButton.setText("he fruit has been used to treat haemoptysis, vaginal and menstrual problems, rheumatoid problems,\n and has been issued as a purgative and demulcent. Green fruits have been used as a diuretic");
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
                labelButton.setText("1. Helps to get a glowing complexion \n 2. High in protein \n 3. Promotes hair growth \n 4. Vitamin A \n 4. Energy \n" +
                        "5. Prevents cancer");
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
                labelButton.setText("Kiwi is no ordinary fruit, both in terms of the way it looks as well as its nutritional content.\n The vibrant green slices specked with little black seeds have always worked wonders in sprucing up desserts and fruit bowls.\n  It is a sight for the eyes and the refreshing flavour makes it a favoured choice among fruits.");
                break;
            }
            case 11:
            {
                labelBirds.setImageResource(R.drawable.lemon);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",11);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Lemon");
                labelButton.setText("");
                break;
            }
            case 12:
            {
                labelBirds.setImageResource(R.drawable.mango);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",12);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Mango");
                break;
            }
            case 13:
            {
                labelBirds.setImageResource(R.drawable.nectarine);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",13);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Nectarine");
                break;
            }
            case 14:
            {
                labelBirds.setImageResource(R.drawable.olive);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",14);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Olive");
                break;
            }
            case 15:
            {
                labelBirds.setImageResource(R.drawable.papaya);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",15);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Papaya");
                break;
            }
            case 16:
            {
                labelBirds.setImageResource(R.drawable.quince);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",16);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Quince");
                break;
            }
            case 17:
            {
                labelBirds.setImageResource(R.drawable.raspberry);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",17);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Raspberry");
                break;
            }
            case 18:
            {
                labelBirds.setImageResource(R.drawable.sweetpotato);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",18);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Sweet Potato");
                break;
            }
            case 19:
            {
                labelBirds.setImageResource(R.drawable.tomato);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",19);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Tomato");
                break;
            }
            case 20:
            {
                labelBirds.setImageResource(R.drawable.uglyfroot);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",20);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("UglyFruit");
                break;
            }
            case 21:
            {
                labelBirds.setImageResource(R.drawable.valencia);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",21);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Valencia");
                break;
            }
            case 22:
            {
                labelBirds.setImageResource(R.drawable.walnut);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",22);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Walnut");
                break;
            }
            case 23:
            {
                labelBirds.setImageResource(R.drawable.xigua);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",23);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Xigua");
                break;
            }
            case 24:
            {
                labelBirds.setImageResource(R.drawable.yambean);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",24);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Yambean");
                break;
            }
            case 25:
            {
                labelBirds.setImageResource(R.drawable.zucchini);
                labelBirds.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(BirdsActivity.this, FruitsZoomAct.class);
                        intent.putExtra("image_url",25);
                        startActivity(intent);
                    }
                });
                labelBirdsName.setText("Zucchini");
                break;
            }
            default:
                break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                startActivity(new Intent(this,MainActivity.class));
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
