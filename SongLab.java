package marrit.marritleenstra_pset3;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



/**
 * Created by Marrit on 26-9-2017.
 * Class containing the centralized data stash for Song objects.
 * Based on Phillips, Stewart, Marsicano (2017). Android Programming. The big nerd ranch guide.
 * 3th edition. Chapter 8.
 */

public class SongLab {
    private static SongLab sSongLab;

    private List<Song> mSongs;

    public static SongLab get(Context context) {
        if (sSongLab == null) {
            sSongLab = new SongLab(context);
        }
        return sSongLab;
    }


    private SongLab(Context context) {
        mSongs = new ArrayList<>();

        //populate list for testing purposes
        for (int i = 0; i <100; i++) {
            Song song = new Song();
            song.setTitle("Song #"+i);
            song.setArtist("Artist #"+i);
            mSongs.add(song);
        }
    }

    public List<Song> getSongs() {
        return mSongs;
    }

    public Song getSong(UUID id) {
        for (Song song : mSongs) {
            if (song.getId().equals(id)) {
                return song;
            }
        }

        return null;
    }

}
