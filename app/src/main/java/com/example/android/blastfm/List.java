package com.example.android.blastfm;

/**
 * {@link List} represents a default list of parameters for a default category.
 * It contains a Title and an Artist name.
 */

public class List {

    /**
     * Song title
     */
    private String mSongTitle;

    /**
     * Artist name
     */
    private String mArtistName;

    /**
     * Image resource ID
     */
    private int mImageResourceId;

    /**
     * Create a new List object.
     *
     * @param songTitle       is the song or podcast title or name
     * @param artistName      is the artist name
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public List(String songTitle, String artistName, int imageResourceId) {
        mSongTitle = songTitle;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the the song or podcast title or name.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the artist name.
     */
    public String getmArtistName() {
        return mArtistName;
    }

    /**
     * Return the image resource ID.
     */
    public int getImageResourceId() { return mImageResourceId; }


}
