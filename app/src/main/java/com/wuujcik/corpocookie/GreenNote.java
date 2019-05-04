package com.wuujcik.corpocookie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class GreenNote extends AppCompatActivity {

    static int noteNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_view);

        //this is the big sticky note, choosing green and setting it visible.
        //also setting textAdvise to be the text that will be written on the big sticky note
        View mainNote = findViewById(R.id.note_green);
        mainNote.setVisibility(View.VISIBLE);
        final TextView textAdvise = findViewById(R.id.text_advise);

        //nextNote is a small sticky note on the bottom left side
        //setting it visible with yellow color
        View nextNote = findViewById(R.id.back_yellow);
        nextNote.setVisibility(View.VISIBLE);

        //backNote is a small sticky note on the bottom right side
        //setting it visible with blue color
        View backNote = findViewById(R.id.back_blue);
        backNote.setVisibility(View.VISIBLE);

        //creating an array list of bullshit wisdoms to be shown to user
        final ArrayList<String> engArray = new ArrayList<>();
        engArray.add("It's Friday");
        engArray.add("It's raining");
        engArray.add("My pillow hit me and I lost consciousness");
        engArray.add("my dog ate my work schedule");
        engArray.add("my bus run away");
        engArray.add("my car broke down");
        engArray.add("am I late? Oh no, my watch must have stood");
        engArray.add("a dog buried my car in the backyard");
        engArray.add("I got betrayed by the new alarm app");
        engArray.add("My car was attacked by a bear");
        engArray.add("i was kidnapped this morning by some activists for 2 hours");
        engArray.add("I was chasing a burglar who broke into the house");
        engArray.add("A zebra was running on highway making a traffic jam");
        engArray.add("I was at the parking lot trying to park my car");
        engArray.add("I was warned by my fairy not to leave early");
        engArray.add("The makeup went really wrong");
        engArray.add("My coffee was too hot");
        engArray.add("I was here, but I fell asleep in the parking lot");
        engArray.add("My fake eyelashes were stuck together");
        engArray.add("cat got stuck in the toilet");
        engArray.add("I was watching a movie and really wanted to finish");
        engArray.add("I got a hairbrush stuck in my hair");
        engArray.add("I was scared by a nightmare");
        engArray.add("I had a Hangover");
        engArray.add("I was helping elderly person cross the street");
        engArray.add("I had a severe allergic reaction to 8:00am");
        engArray.add("I stopped to rescue a duck that had been hit by a car");
        engArray.add("I had to get a squirrel out of my bedroom");
        engArray.add("There was a cow blocking the road");
        engArray.add("I locked myself and my dog out of my apartment");
        engArray.add("A drone crashed for my tram");
        engArray.add("My pet turtle needed to visit the exotic animal clinic");
        engArray.add("I thought my commute time counts toward my work hours");


        //random generator chooses randomly the index number of the arraylist
        Random generator = new Random();
        int arrayLength = engArray.size();
        noteNumber = generator.nextInt(arrayLength);

        //sets the randomly chosen wisdom to be shown on the main yellow sticky note
        textAdvise.setText(engArray.get(noteNumber));

        //clicking on the nextNote randomly chooses a new wisdom to be shown
        nextNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random generator = new Random();
                int arrayLength = engArray.size();
                noteNumber = generator.nextInt(arrayLength);
                textAdvise.setText(engArray.get(noteNumber));
            }
        });


        //clicking on the backNote opens the main menu
        backNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GreenNote.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
