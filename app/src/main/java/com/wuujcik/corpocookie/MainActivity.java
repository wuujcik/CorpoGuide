package com.wuujcik.corpocookie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View mainYellow = findViewById(R.id.main_yellow);
        View mainBlue = findViewById(R.id.main_blue);
        View mainGreen = findViewById(R.id.main_green);
        View mainPink = findViewById(R.id.main_pink);


        //when clicking on the yellow sticky note, opens the YellowNote activity
        mainYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, YellowNote.class);
                startActivity(intent);
            }
        });

        //when clicking on the blue sticky note, opens the BlueNote activity
        mainBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BlueNote.class);
                startActivity(intent);
            }
        });

        //when clicking on the green sticky note, opens the GreenNote activity
        mainGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GreenNote.class);
                startActivity(intent);
            }
        });

        //when clicking on the pink sticky note, opens the GreenNote activity
        mainPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PinkNote.class);
                startActivity(intent);
            }
        });

    }
}
