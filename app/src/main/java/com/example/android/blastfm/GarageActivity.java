package com.example.android.blastfm;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GarageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_list);

        // Create nn ArrayList of tracks
        ArrayList<List> tracks = new ArrayList<List>();
        // add items in the list
        tracks.add(new List("The Witch", "The Sonics", R.drawable.sonics));
        tracks.add(new List("Save My Soul", "Wimple Winch", R.drawable.wimplewinch));
        tracks.add(new List("Dirty Water", "The Standells", R.drawable.standells));
        tracks.add(new List("I've Got Everything Indeed", "Thee Mighty Caesars", R.drawable.mightycaesars));
        tracks.add(new List("Bad Little Woman", "The Shadows of Knight", R.drawable.shadowsofknight));
        tracks.add(new List("Psychotic Reaction", "Count Five", R.drawable.countfive));
        tracks.add(new List("Rumble", "Link Wray", R.drawable.linkwray));
        tracks.add(new List("Pushing Too Hard", "The Seeds", R.drawable.seeds));
        tracks.add(new List("Black Magick", "Ty Segall", R.drawable.tysegall));
        tracks.add(new List("Talk Talk", "The Music Machine", R.drawable.musicmachine));
        tracks.add(new List("Louie Louie", "The Kingsmen", R.drawable.kingsmen));
        tracks.add(new List("Action Woman", "The Litter", R.drawable.litter));
        tracks.add(new List("Strychnine", "The Sonics", R.drawable.sonics));
        tracks.add(new List("After Midnight", "The Milkshakes", R.drawable.milkshakes));
        tracks.add(new List("Sometimes Good Guys Don't Wear White", "The Standells", R.drawable.standells));
        tracks.add(new List("You Make Me Die", "Thee Mighty Caesars", R.drawable.mightycaesars));
        tracks.add(new List("Evil Hoodoo", "The Seeds", R.drawable.seeds));
        tracks.add(new List("Double Yellow Line", "The Music Machine", R.drawable.musicmachine));
        tracks.add(new List("Nitroglycerine", "The Gories", R.drawable.gories));
        tracks.add(new List("Highway 69", "The Fuzztones", R.drawable.fuzztones));
        tracks.add(new List("Wild Thing", "The Troggs", R.drawable.troggs));

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

