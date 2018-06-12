package com.example.android.blastfm;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PunkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_list);

        // Create nn ArrayList of tracks
        ArrayList<List> tracks = new ArrayList<List>();
        // add items in the list
        tracks.add(new List("Makes No Sense At All", "Hüsker Dü", R.drawable.huskerdu));
        tracks.add(new List("Sinister Rouge", "Bad Religion", R.drawable.badreligion));
        tracks.add(new List("Love Song", "The Damned", R.drawable.damned));
        tracks.add(new List("Suburban Home", "Descendents", R.drawable.descendents));
        tracks.add(new List("Time Bomb", "Rancid", R.drawable.rancid));
        tracks.add(new List("Safe European Home", "The Clash", R.drawable.clash));
        tracks.add(new List("Rise Above", "Black Flag", R.drawable.blackflag));
        tracks.add(new List("The Big Takeover", "Bad Brains", R.drawable.badbrains));
        tracks.add(new List("Sheena Is a Punk Rocker", "The Ramones", R.drawable.ramones));
        tracks.add(new List("Gotta Go", "Agnostic Front", R.drawable.agnosticfront));
        tracks.add(new List("Orgasm Addicted", "Buzzcocks", R.drawable.buzzcocks));
        tracks.add(new List("Tomorrows Girls", "UK Subs", R.drawable.uksubs));
        tracks.add(new List("Fuck Authority", "Pennywise", R.drawable.pennywise));
        tracks.add(new List("Sound System", "Operation Ivy", R.drawable.operationivy));
        tracks.add(new List("Love Song", "The Damned", R.drawable.damned));
        tracks.add(new List("Roots Radical", "Rancid", R.drawable.rancid));
        tracks.add(new List("How Could Hell be Any Worse?", "Bad Religion", R.drawable.badreligion));
        tracks.add(new List("New Rose", "The Damned", R.drawable.damned));
        tracks.add(new List("Don't Want To Know If You Are Lonely", "Hüsker Dü", R.drawable.huskerdu));
        tracks.add(new List("My Brain Is Hanging Upside Down (Bonzo Goes to Bitburg)", "The Ramones", R.drawable.ramones));
        tracks.add(new List("Hybrid Moments", "Misfits", R.drawable.misfits));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single track.
        ListAdapter adapter = new ListAdapter(this, tracks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each track in the list of tracks.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // Enable Up button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }
}

