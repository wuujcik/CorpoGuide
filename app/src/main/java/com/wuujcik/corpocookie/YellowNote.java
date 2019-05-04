package com.wuujcik.corpocookie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class YellowNote extends AppCompatActivity {

    static int noteNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_view);

        //this is the big sticky note, choosing yellow and setting it visible.
        //also setting textAdvise to be the text that will be written on the big sticky note
        View mainNote = findViewById(R.id.note_yellow);
        mainNote.setVisibility(View.VISIBLE);
        final TextView textAdvise = findViewById(R.id.text_advise);

        //nextNote is a small sticky note on the bottom left side
        //setting it visible with green color
        View nextNote = findViewById(R.id.back_green);
        nextNote.setVisibility(View.VISIBLE);

        //backNote is a small sticky note on the bottom right side
        //setting it visible with blue color
        View backNote = findViewById(R.id.back_blue);
        backNote.setVisibility(View.VISIBLE);

        //creating an array list of bullshit wisdoms to be shown to user
        final ArrayList<String> engArray = new ArrayList<>();
        engArray.add("You will be sent for a business trip");
        engArray.add("Your computer will crash");
        engArray.add("Nothing will happen today");
        engArray.add("You will be escalated");
        engArray.add("Your vacation will be approved");
        engArray.add("your vacation will be rejected");
        engArray.add("toilet paper will finish");
        engArray.add("coffee machine will break");
        engArray.add("your boss will pat your shoulder");
        engArray.add("you will win an argument");
        engArray.add("your crash will smile to you");
        engArray.add("it will start raining at 5pm");
        engArray.add("it will stop raining at 5pm");
        engArray.add("you will stay overtime");
        engArray.add("you will tell on your friend");
        engArray.add("you will such up to your boss");
        engArray.add("colleague will help you");
        engArray.add("you will go for a beer after work");
        engArray.add("Meetings all day long");
        engArray.add("meeting will be useful");
        engArray.add("you will meet all the KPI's");
        engArray.add("you will find a new meme");
        engArray.add("somebody will else will do your job");
        engArray.add("you will be promoted");
        engArray.add("you will get a bonus");
        engArray.add("you will get a salary raise");
        engArray.add("you will be fired");
        engArray.add("you will get a warning");
        engArray.add("you will have a meeting to plan another meeting");
        engArray.add("printer will break down");
        engArray.add("snacks in the office");
        engArray.add("fruits in the office");
        engArray.add("somebody will steal your lunch");
        engArray.add("your boss will get sick");
        engArray.add("your enemy will be promoted");
        engArray.add("you will cry in a toilet");
        engArray.add("you will overcome a challenging task");
        engArray.add("pizza day!");
        engArray.add("team building will be cancelled");
        engArray.add("team building will be set up");
        engArray.add("you will fall asleep on a call");
        engArray.add("customer will praise you");
        engArray.add("manager will praise you");
        engArray.add("you'll miss the deadline");
        engArray.add("your boss will arrive even later than you");
        //        engArray.add("a");
        //        engArray.add("a");
        //        engArray.add("a");


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
                Intent intent = new Intent(YellowNote.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
