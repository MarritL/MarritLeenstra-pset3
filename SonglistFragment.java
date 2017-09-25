package marrit.marritleenstra_pset3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Marrit on 25-9-2017.
 */

public class SonglistFragment extends Fragment {

    private Song mSong;
    private TextView mSongTitle;
    private TextView mSongArtist;
    private TextView mSongAlbum;
    private TextView mSongGenre;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSong = new Song();

    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_song, container, false);

        mSongTitle = (TextView) v.findViewById(R.id.song_title);
        // TODO get songTitle
        mSong.setTitle("testTitle");
        mSongTitle.setText(mSong.getTitle());

        mSongArtist = (TextView) v.findViewById(R.id.song_artist);
        // TODO get songArtist
        mSong.setArtist("testArtist");
        mSongArtist.setText(mSong.getArtist());

        mSongAlbum = (TextView) v.findViewById(R.id.song_album);
        // TODO get songArtist
        mSong.setAlbum("testAlbum");
        mSongAlbum.setText(mSong.getAlbum());

        mSongGenre = (TextView) v.findViewById(R.id.song_genre);
        // TODO get songArtist
        mSong.setGenre("testGenre");
        mSongGenre.setText(mSong.getGenre());

        return v;
    }

}
