package com.wuujcik.corpocookie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class BlueNote extends AppCompatActivity {

    static int noteNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_view);

        //this is the big sticky note, choosing yellow and setting it visible.
        //also setting textAdvise to be the text that will be written on the big sticky note
        View mainNote = findViewById(R.id.note_blue);
        mainNote.setVisibility(View.VISIBLE);
        final TextView textAdvise = findViewById(R.id.text_advise);

        //nextNote is a small sticky note on the bottom left side
        //setting it visible with green color
        View nextNote = findViewById(R.id.back_yellow);
        nextNote.setVisibility(View.VISIBLE);

        //backNote is a small sticky note on the bottom right side
        //setting it visible with blue color
        View backNote = findViewById(R.id.back_pink);
        backNote.setVisibility(View.VISIBLE);

        //creating an array list of bullshit wisdoms to be shown to user
        final ArrayList<String> engArray = new ArrayList<>();
        engArray.add("You must be the change!");
        engArray.add("Success does not happen. Success is made to happen!");
        engArray.add("Every target is at first impossible");
        engArray.add("Be twice as good as you were this time 6 months ago!");
        engArray.add("When was your last success?");
        engArray.add("Tomorrow starts today!");
        engArray.add("No to defects!");
        engArray.add("Decide to be the best!");
        engArray.add("Don't dream about it, work for it!");
        engArray.add("Be the best version of yourself!");
        engArray.add("You can make the difference!");
        engArray.add("What have you done for the company today?");
        engArray.add("Time for acting is now!");
        engArray.add("Consider your dreams as targets!");
        engArray.add("Unlock your career potential!");
        engArray.add("There is no other defeat than resignation");
        engArray.add("Don’t settle on the good, go for the great!");
        engArray.add("Customer first!");
        engArray.add("Dream big!");
        engArray.add("Sky is the limit!");
        engArray.add("Be proud to deliver perfection!");
        engArray.add("Keys to success: Who? You! When? Now!");
        engArray.add("Quality does not know compromise.");
        engArray.add("success begins at the end of you comfort zone");
        engArray.add("The future of the company lays in your hands!");
        engArray.add("Just do, thinking is the beginning of betrayal!");
        //   engArray.add("!");


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
                Intent intent = new Intent(BlueNote.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
