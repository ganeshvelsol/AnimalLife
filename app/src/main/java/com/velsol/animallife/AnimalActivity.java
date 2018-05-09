package com.velsol.animallife;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        animalNames=(TextView)findViewById(R.id.animal_name);
        left=(ImageView)findViewById(R.id.left);
        right=(ImageView)findViewById(R.id.right);
        mImageDisplay=(ImageView)findViewById(R.id.image_show);
        description=(TextView)findViewById(R.id.description_label);
        mImageDisplay.setImageResource(R.drawable.alligator);
        mImageDisplay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                intent.putExtra("image_url",88);
                startActivity(intent);
            }
        });
        animalNames.setText("Alligator");
        //assigning the text color for the description
        Spannable word1 = new SpannableString("\n An alligator is a crocodilian in the genus Alligator of the family Alligatoridae. \n" + " \tAlligator Life Span is 30-50 years.");
        word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        description.setText(word1);
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
            mImageDisplay.setImageResource(R.drawable.alligator);
            mImageDisplay.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(AnimalActivity.this, ImageShow.class);
                    intent.putExtra("image_url",0);
                    startActivity(intent);
                }
            });
            animalNames.setText("Alligator");
            Spannable word1 = new SpannableString("\n An alligator is a crocodilian in the genus Alligator of the family Alligatoridae. \n" +
                    " \t Alligator Life Span is 30-50 years.");
            word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            description.setText(word1);
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

                    Spannable word1 = new SpannableString("\n The English word bear comes from Old English bera and belongs to a family of names for the bear in Germanic languages\n\nBears are carnivoran mammals of the family Ursidae.\nThey are classified as caniforms, or doglike carnivorans. Although only eight species of bears are extant, they are widespread, appearing in a wide variety of habitats throughout the Northern Hemisphere and partially in the Southern Hemisphere. \nBears are found on the continents of North America, South America, Europe, and Asia. \nCommon characteristics of modern bears include large bodies with stocky legs, long snouts, small rounded ears, shaggy hair, plantigrade paws with five nonretractile claws, and short tails.\tBear Life span is 20 years.");
                    word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    description.setText(word1);
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
                    Spannable word1 = new SpannableString("\nCrabs are decapod crustaceans of the infraorder Brachyura, which typically have a very short projecting tail, usually entirely hidden under the thorax. They live in all the world's oceans, in fresh water, and on land, are generally covered with a thick exoskeleton and have a single pair of claws \n \t life span of this crab is 8-13 years.");
                    word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    description.setText(word1);
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
                    Spannable word1 = new SpannableString("\nThe donkey or ass  is a domesticated member of the horse family, Equidae.\n" +
                            " The wild ancestor of the donkey is the African wild ass. The donkey has been used as a working animal for at least 5000 years. There are more than 40 million donkeys in the world, mostly in underdeveloped countries, where they are used principally as draught or pack animals.\n \t A male donkey or ass is called a jack, a female a jenny or jennet.a young donkey is a foal. Jack donkeys are often used to mate with female horses to produce mules; the biological reciprocalof a mule, from a stallion and jenny as its parents instead, is called a hinny. \tLife span of Donkey is 25-30 years.");
                    word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    description.setText(word1);
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
                    Spannable word1 = new SpannableString("\nAll elephants have several distinctive \n features, the most notable of which is a \n long trunk (also called a proboscis), used for many purposes, \n particularly breathing, lifting water, and grasping objects. \n Their incisors grow into tusks, which can serve as weapons and as tools for moving objects and digging.\n  Elephants' large ear flaps help to control their body temperature. \n Their pillar-like legs can carry their great weight.\n African elephants have larger ears and concave backs \nwhile Asian elephants have smaller ears and convex or level backs. \n\t Asian Elephant life spanis 48 years.");
                    word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    description.setText(word1);
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
                    description.setText("Flamingos or flamingoes are a type of wading bird in the family Phoenicopteridae, the only bird family in the order Phoenicopteriformes.\t \nFour flamingo species are in the Americas and two species are in the Old World.\n" +
                            "\tLife span of flamingo is 40 years.");
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
                    description.setText("\n The giraffe (Giraffa) is a genus of African even-toed ungulate mammals, the tallest living terrestrial animals and the largest ruminants. The genus currently consists of one species, Giraffa camelopardalis, the type species. Seven other species are extinct, prehistoric species known from fossils. \n\tTaxonomic classifications of one to eight extant giraffe species have been described, based upon research into the mitochondrial and nuclear DNA, as well as morphological measurements of Giraffa, \nbut currently recognises only one species with nine subspecies. \n \tLife span of girafee is 25 years.");
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
                    description.setText("\n" + "Common hippopotamus\n" + "Hippopotamus amphibius in Tanzania 4041\n" + "A hippopotamus in Tanzania\n" +
                            "Conservation status Vulnerable Scientific classification Kingdom:\tAnimaliaPhylum:\tChordata\n" +
                            "Class:\tMammalia\n" + "Order:\tArtiodactyla\n" + "Family:\tHippopotamidaeGenus:\tHippopotamus\n" + "Species:\tH. amphibius\n" +
                            "Binomial name Hippopotamus amphibius\n" + "Linnaeus, Hippo Range map of the African hippopotamus. Historic range is in red while current range is in green.\n" +
                            "The common hippopotamus (Hippopotamus amphibius), or hippo, is a large, mostly herbivorous, semiaquatic mammal native to sub-Saharan Africa, and one of only two extant species in the family Hippopotamidae, the other being the pygmy hippopotamus (Choeropsis liberiensis or Hexaprotodon liberiensis). The name comes from the ancient Greek for river horse . After the elephant and rhinoceros, the common hippopotamus is the third-largest type of land mammal and the heaviest extant artiodactyl.");
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
                    description.setText("Iguana  Spanish: [iˈɣwana]) is a genus of herbivorous lizards that are native to tropical areas of Mexico, Central America, South America, and the Caribbean.\n The genus was first described in 1768 by Austrian naturalist Josephus Nicolaus Laurenti in his book Specimen Medicum, Exhibens Synopsin Reptilium Emendatam cum Experimentis circa Venena.\n" +
                            " Two species are included in the genus Iguana: the green iguana, which is widespread throughout its range and a popular pet, and the Lesser Antillean iguana, which is native to the Lesser Antilles and endangered due to habitat destruction and hybridization with introduced green iguanas.\n" +
                            "\n\tLife span og Iguana is around 8 years.");
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
                    description.setText("\nThe jaguar is the largest cat species in the Americas and the third-largest after the tiger and the lion.\n The word 'jaguar' is thought to derive from the Tupian word yaguara, meaning beast of prey This spotted cat closely resembles the leopard, but is usually larger and sturdier \n \tLife span of Jaguar is 12-15 years.");
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
                    description.setText("The kangaroo is a marsupial from the family Macropodidae (macropods, meaning large foot). In common use the term is used to describe the largest species from this family, especially those of the genus Macropus \n" +
                            "Kangaroos have large, powerful hind legs, large feet adapted for leaping, a long muscular tail for balance, and a small head. Like most marsupials, female kangaroos have a pouch called a marsupium in which joeys complete postnatal development.\n" +
                            "\n\tLife span of Kangaroo is can live 8 to 12 years in the wild and up to 20 years in captivity.");
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
                    description.setText("The lion (Panthera leo) is a species in the family Felidae, and a member of the genus Panthera. It exhibits a pronounced sexual dimorphism; males are larger than females with a typical weight range of 150 to 250 kg (331 to 551 lb) for the former and 120 to 182 kg (265 to 401 lb) for the latter. In addition, male lions have a prominent mane, which is the most recognisable feature of the species. Both sexes have hairy tufts at the end of their tails. \n\t Life span of lion is 10-14 years.");
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
                    description.setText("Macaw is a bird . And Life span is 50 years.");
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
                    description.setText("Life Span in Captivity. In captivity, Japanese fire belly newts tend to live 10 or 15 years but can live for up to 30. some live even longer.");
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
                    description.setText("At one year of age, common ostriches weigh approximately 45 kilograms (99 lb). Their lifespan is up to 40–45 years. The feathers of adult males are mostly black, with white primaries and a white tail. However, the tail of one subspecies is buff.");
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
                    description.setText("Life span of pig is 8 years.");
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
                    description.setText(" Japanese quail mature in about 6 weeks and are usually in full egg production by 50 days of age. With proper care, hens should lay 200 eggs in their first year of lay. Life expectancy is only 2 to 2½ years.");
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
                    description.setText(" Brown rat life span is 2 years \n" +
                            "\tBlack rat life span is 12 months.");
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
                    description.setText("sheep is an animal having 4-legs , the food for sheep is green grass and life span is 10-12 years.");
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
                    description.setText("Tiger is the dangerous animal in the world , the foor for tiger is fully Non-vegterian means it eats all animals and peoples .\n" +
                            "Life span is 20-26 years.");
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
                    description.setText("Lifespan of urial sheep ranges from 8 to 12 years.");
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
                    description.setText("Life span of grey wolf is 6-8 years");
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
                    description.setText("Human disruption of habitats may also limit the lifespan, which averages 2 years in the wild.");
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
                    description.setText("Life span of yak is 20 years");
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
                    description.setText(" Life Span in Nature and Captivity. Burchell's zebras that freely roam in nature have approximate lifespans of 20 to 30 years. They usually have longer lifespans when they live in captive environments such as zoos. In those cases, they can often live for up to 40 years.");
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

                Spannable word1 = new SpannableString("\n The English word bear comes from Old English bera and belongs to a family of names for the bear in Germanic languages\n\nBears are carnivoran mammals of the family Ursidae.\nThey are classified as caniforms, or doglike carnivorans. Although only eight species of bears are extant, they are widespread, appearing in a wide variety of habitats throughout the Northern Hemisphere and partially in the Southern Hemisphere. \nBears are found on the continents of North America, South America, Europe, and Asia. \nCommon characteristics of modern bears include large bodies with stocky legs, long snouts, small rounded ears, shaggy hair, plantigrade paws with five nonretractile claws, and short tails.\tBear Life span is 20 years.");
                word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                description.setText(word1);
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
                Spannable word1 = new SpannableString("\nCrabs are decapod crustaceans of the infraorder Brachyura, which typically have a very short projecting tail, usually entirely hidden under the thorax. They live in all the world's oceans, in fresh water, and on land, are generally covered with a thick exoskeleton and have a single pair of claws \n \t life span of this crab is 8-13 years.");
                word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                description.setText(word1);
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

                Spannable word1 = new SpannableString("\nThe donkey or ass  is a domesticated member of the horse family, Equidae.\n" +
                        " The wild ancestor of the donkey is the African wild ass. The donkey has been used as a working animal for at least 5000 years. There are more than 40 million donkeys in the world, mostly in underdeveloped countries, where they are used principally as draught or pack animals.\n \t A male donkey or ass is called a jack, a female a jenny or jennet.a young donkey is a foal. Jack donkeys are often used to mate with female horses to produce mules; the biological reciprocalof a mule, from a stallion and jenny as its parents instead, is called a hinny. \tLife span of Donkey is 25-30 years.");
                word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                description.setText(word1);
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
                Spannable word1 = new SpannableString("\nAll elephants have several distinctive \n features, the most notable of which is a \n long trunk (also called a proboscis), used for many purposes, \n particularly breathing, lifting water, and grasping objects. \n Their incisors grow into tusks, which can serve as weapons and as tools for moving objects and digging.\n  Elephants' large ear flaps help to control their body temperature. \n Their pillar-like legs can carry their great weight.\n African elephants have larger ears and concave backs \nwhile Asian elephants have smaller ears and convex or level backs. \n\t Asian Elephant life spanis 48 years.");
                word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                description.setText(word1);
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
                description.setText("Flamingos or flamingoes are a type of wading bird in the family Phoenicopteridae, the only bird family in the order Phoenicopteriformes.\t \nFour flamingo species are in the Americas and two species are in the Old World.\n" +
                        "\tLife span of flamingo is 40 years.");
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
                description.setText("\n The giraffe (Giraffa) is a genus of African even-toed ungulate mammals, the tallest living terrestrial animals and the largest ruminants. The genus currently consists of one species, Giraffa camelopardalis, the type species. Seven other species are extinct, prehistoric species known from fossils. \n\tTaxonomic classifications of one to eight extant giraffe species have been described, based upon research into the mitochondrial and nuclear DNA, as well as morphological measurements of Giraffa, \nbut currently recognises only one species with nine subspecies. \n \tLife span of girafee is 25 years.");
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
                description.setText("\n" + "Common hippopotamus\n" + "Hippopotamus amphibius in Tanzania 4041\n" + "A hippopotamus in Tanzania\n" +
                        "Conservation status Vulnerable Scientific classification Kingdom:\tAnimaliaPhylum:\tChordata\n" +
                        "Class:\tMammalia\n" + "Order:\tArtiodactyla\n" + "Family:\tHippopotamidaeGenus:\tHippopotamus\n" + "Species:\tH. amphibius\n" +
                        "Binomial name Hippopotamus amphibius\n" + "Linnaeus, Hippo Range map of the African hippopotamus. Historic range is in red while current range is in green.\n" +
                        "The common hippopotamus (Hippopotamus amphibius), or hippo, is a large, mostly herbivorous, semiaquatic mammal native to sub-Saharan Africa, and one of only two extant species in the family Hippopotamidae, the other being the pygmy hippopotamus (Choeropsis liberiensis or Hexaprotodon liberiensis). The name comes from the ancient Greek for river horse . After the elephant and rhinoceros, the common hippopotamus is the third-largest type of land mammal and the heaviest extant artiodactyl.");
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
                description.setText("Iguana  Spanish: [iˈɣwana]) is a genus of herbivorous lizards that are native to tropical areas of Mexico, Central America, South America, and the Caribbean.\n The genus was first described in 1768 by Austrian naturalist Josephus Nicolaus Laurenti in his book Specimen Medicum, Exhibens Synopsin Reptilium Emendatam cum Experimentis circa Venena.\n" +
                        " Two species are included in the genus Iguana: the green iguana, which is widespread throughout its range and a popular pet, and the Lesser Antillean iguana, which is native to the Lesser Antilles and endangered due to habitat destruction and hybridization with introduced green iguanas.\n" +
                        "\n\tLife span og Iguana is around 8 years.");
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
                description.setText("\nThe jaguar is the largest cat species in the Americas and the third-largest after the tiger and the lion.\n The word 'jaguar' is thought to derive from the Tupian word yaguara, meaning beast of prey This spotted cat closely resembles the leopard, but is usually larger and sturdier \n \tLife span of Jaguar is 12-15 years.");
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
                description.setText("The kangaroo is a marsupial from the family Macropodidae (macropods, meaning large foot). In common use the term is used to describe the largest species from this family, especially those of the genus Macropus \n" +
                        "Kangaroos have large, powerful hind legs, large feet adapted for leaping, a long muscular tail for balance, and a small head. Like most marsupials, female kangaroos have a pouch called a marsupium in which joeys complete postnatal development.\n" +
                        "\n\tLife span of Kangaroo is can live 8 to 12 years in the wild and up to 20 years in captivity.");
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
                description.setText("The lion (Panthera leo) is a species in the family Felidae, and a member of the genus Panthera. It exhibits a pronounced sexual dimorphism; males are larger than females with a typical weight range of 150 to 250 kg (331 to 551 lb) for the former and 120 to 182 kg (265 to 401 lb) for the latter. In addition, male lions have a prominent mane, which is the most recognisable feature of the species. Both sexes have hairy tufts at the end of their tails. \n\t Life span of lion is 10-14 years.");
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
                description.setText("Macaw is a bird . And Life span is 50 years.");
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
                description.setText("Life Span in Captivity. In captivity, Japanese fire belly newts tend to live 10 or 15 years but can live for up to 30. some live even longer.");
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
                description.setText("At one year of age, common ostriches weigh approximately 45 kilograms (99 lb). Their lifespan is up to 40–45 years. The feathers of adult males are mostly black, with white primaries and a white tail. However, the tail of one subspecies is buff.");
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
                description.setText("Life span of pig is 8 years.");
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
                description.setText(" Japanese quail mature in about 6 weeks and are usually in full egg production by 50 days of age. With proper care, hens should lay 200 eggs in their first year of lay. Life expectancy is only 2 to 2½ years.");
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
                description.setText(" Brown rat life span is 2 years \n" +
                        "\tBlack rat life span is 12 months.");
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
                description.setText("sheep is an animal having 4-legs , the food for sheep is green grass and life span is 10-12 years.");
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
                description.setText("Tiger is the dangerous animal in the world , the foor for tiger is fully Non-vegterian means it eats all animals and peoples .\n" +
                        "Life span is 20-26 years.");
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
                description.setText("Lifespan of urial sheep ranges from 8 to 12 years.");
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
                description.setText("Life span of grey wolf is 6-8 years");
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
                description.setText("Human disruption of habitats may also limit the lifespan, which averages 2 years in the wild.");
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
                description.setText("Life span of yak is 20 years");
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
                description.setText(" Life Span in Nature and Captivity. Burchell's zebras that freely roam in nature have approximate lifespans of 20 to 30 years. They usually have longer lifespans when they live in captive environments such as zoos. In those cases, they can often live for up to 40 years.");
                break;
            }
            default:
                Toast.makeText(this, "No Images found..", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
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
