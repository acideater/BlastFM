package com.example.android.blastfm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.garage);
        // Set a clickListener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link GarageActivity}
                Intent artistsIntent = new Intent(MainActivity.this, GarageActivity.class);

                // start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows songs category
        TextView songs = (TextView) findViewById(R.id.punk);
        // Set a clickListener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link PunkActivity}
                Intent songsIntent = new Intent(MainActivity.this, PunkActivity.class);

                // start the new activity
                startActivity(songsIntent);
            }
        });


        // Find the View that shows podcasts category
        TextView podcasts = (TextView) findViewById(R.id.psychedelic);
        // Set a clickListener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link PsychedelicActivity}
                Intent podcastIntent = new Intent(MainActivity.this, PsychedelicActivity.class);

                // start the new activity
                startActivity(podcastIntent);
            }
        });


        // Play Highlight button
        Button playHighlight = findViewById(R.id.playHighlightButton);
        playHighlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openNowPlaying = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(openNowPlaying);
            }
        });

    }


}
