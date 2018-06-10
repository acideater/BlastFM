package com.example.android.blastfm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PsychedelicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_list);

        // Create nn ArrayList of tracks
        ArrayList<List> tracks = new ArrayList<List>();
        // add items in the list
        tracks.add(new List("Care of Cell 44", "The Zombies", R.drawable.zombies));
        tracks.add(new List("Magical Mystery Tour", "The Beatles", R.drawable.beatles));
        tracks.add(new List("Fire Brigade", "The Move", R.drawable.move));
        tracks.add(new List("Open My Eyes", "Nazz", R.drawable.nazz));
        tracks.add(new List("Incense and Peppermints", "Strawberry Alarm Clock", R.drawable.strawberry));
        tracks.add(new List("The Trip", "Kim Fowley", R.drawable.kimfowley));
        tracks.add(new List("(We Ain't Got) Nothin' Yet", "Blues Magoos", R.drawable.bluesmagoos));
        tracks.add(new List("My Mind's Eye", "Small Faces", R.drawable.smallfaces));
        tracks.add(new List("White Rabbit", "Jefferson Airplane", R.drawable.jeffersonairplane));
        tracks.add(new List("Sunshine Of Your Love", "Cream", R.drawable.cream));
        tracks.add(new List("Purple Haze", "Jimmy Hendrix", R.drawable.jimmyhendrix));
        tracks.add(new List("Arnold Lane", "Pink Floyd", R.drawable.pinkfloyd));
        tracks.add(new List("Mindrocker", "Fenwyck", R.drawable.fenwyck));
        tracks.add(new List("Time Of The Season", "The Zombies", R.drawable.zombies));
        tracks.add(new List("Strawberry Fields Forever", "The Beatles", R.drawable.beatles));
        tracks.add(new List("Blackberry Way", "The Move", R.drawable.move));
        tracks.add(new List("Pipe Dream", "Blues Magoos", R.drawable.bluesmagoos));
        tracks.add(new List("Itchycoo Park", "Small Faces", R.drawable.smallfaces));
        tracks.add(new List("I Feel Free", "Cream", R.drawable.cream));
        tracks.add(new List("Are you Experienced?", "Jimmy Hendrix", R.drawable.jimmyhendrix));
        tracks.add(new List("See Emily Play", "Pink Floyd", R.drawable.pinkfloyd));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single track.
        ListAdapter adapter = new ListAdapter(this, tracks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each track in the list of tracks.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


    }
}
