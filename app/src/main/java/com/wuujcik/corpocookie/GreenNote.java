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
        //setting it visible with pink color
        View backNote = findViewById(R.id.back_pink);
        backNote.setVisibility(View.VISIBLE);

        //creating an array list of bullshit wisdoms to be shown to user
        final ArrayList<String> engArray = new ArrayList<>();
        engArray.add("Customer first!");
        engArray.add("Dream big!");
        engArray.add("test!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");
//        engArray.add("!");


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
