package marrit.marritleenstra_pset3;


import java.util.UUID;

/**
 * Created by Marrit on 24-9-2017.
 * Class that holds all the information about a song.
 */

public class Song {


    private UUID mId;
    private String mTitle;
    private String mArtist;
    private String mAlbum;
    private String mGenre;


    // initiate instance of Class with Id
    public Song() {
        mId = UUID.randomUUID();
    }

    // getters and setters for all fields
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public void setAlbum(String album) {
        mAlbum = album;
    }

    public String getGenre() {
        return mGenre;
    }

    public void setGenre(String genre) {
        mGenre = genre;
    }
}
