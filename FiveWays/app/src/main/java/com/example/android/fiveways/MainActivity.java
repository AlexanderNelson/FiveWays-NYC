package com.example.android.fiveways;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        creates custom typeface
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Sea.ttf");
        TextView myBeachtext = (TextView) findViewById(R.id.beach);
        TextView myParktext = (TextView) findViewById(R.id.park);
        TextView myShakestext = (TextView) findViewById(R.id.shakespeare);
        TextView mySmorgtext = (TextView) findViewById(R.id.smorgasburg);
        TextView myHightext = (TextView) findViewById(R.id.highline);
        myBeachtext.setTypeface(myTypeface);
        myParktext.setTypeface(myTypeface);
        myShakestext.setTypeface(myTypeface);
        mySmorgtext.setTypeface(myTypeface);
        myHightext.setTypeface(myTypeface);


        // Find the View that shows the beach category
        TextView beach = (TextView) findViewById(R.id.beach);

        // Set a click listener on that View
        beach.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the beach category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link KeywordsActivity}
                Intent beachIntent = new Intent(MainActivity.this, BeachActivity.class);

                // Start the new activity
                startActivity(beachIntent);
            }
        });

        // Find the View that shows the smorgasburg category
        TextView smorgasburg = (TextView) findViewById(R.id.smorgasburg);

        // Set a click listener on that View
        smorgasburg.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the smorgasburg category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent smorgasburgIntent = new Intent(MainActivity.this, SmorgasburgActivity.class);

                // Start the new activity
                startActivity(smorgasburgIntent);
            }
        });

        // Find the View that shows the shakespeare category
        TextView shakespeare = (TextView) findViewById(R.id.shakespeare);

        // Set a click listener on that View
        shakespeare.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the shakespeare category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent shakespeareIntent = new Intent(MainActivity.this, ShakespeareActivity.class);

                // Start the new activity
                startActivity(shakespeareIntent);
            }
        });

        // Find the View that shows the park category
        TextView park = (TextView) findViewById(R.id.park);

        // Set a click listener on that View
        park.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the park category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenreActivity}
                Intent parkIntent = new Intent(MainActivity.this, ParkActivity.class);

                // Start the new activity
                startActivity(parkIntent);
            }

        });

        // Find the View that shows the highline category
        TextView highline = (TextView) findViewById(R.id.highline);

        // Set a click listener on that View
        highline.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the highline category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenreActivity}
                Intent highlineIntent = new Intent(MainActivity.this, HighLineActivity.class);

                // Start the new activity
                startActivity(highlineIntent);
            }

        });
    }
}
