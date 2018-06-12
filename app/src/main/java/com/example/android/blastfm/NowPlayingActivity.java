package com.example.android.blastfm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // Find the View that shows the artists category
        TextView artists = findViewById(R.id.garage);
        // Set a clickListener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link GarageActivity}
                Intent artistsIntent = new Intent(NowPlayingActivity.this, GarageActivity.class);

                // start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows songs category
        TextView songs = findViewById(R.id.punk);
        // Set a clickListener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link PunkActivity}
                Intent songsIntent = new Intent(NowPlayingActivity.this, PunkActivity.class);

                // start the new activity
                startActivity(songsIntent);
            }
        });


        // Find the View that shows podcasts category
        TextView podcasts = findViewById(R.id.psychedelic);
        // Set a clickListener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link PsychedelicActivity}
                Intent podcastIntent = new Intent(NowPlayingActivity.this, PsychedelicActivity.class);

                // start the new activity
                startActivity(podcastIntent);
            }
        });

        // Enable Up button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }


}