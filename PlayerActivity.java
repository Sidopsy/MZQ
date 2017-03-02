package dev.feather.mzq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PlayerActivity extends AppCompatActivity implements Player {
    private ListView musicList;
    private ArrayAdapter<Track> trackArrayAdapter;
    private List<Track> trackList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        musicList = (ListView) findViewById(R.id.musicList);

        trackList = new TrackList();

        trackArrayAdapter = new ArrayAdapter<Track>(this,android.R.layout.simple_list_item_1, trackList);

        musicList.setAdapter(trackArrayAdapter);
    }

    @Override
    public void play(Track t) {

    }

    @Override
    public void stop(Track t) {

    }

    @Override
    public void next(Track t) {

    }

    @Override
    public void prev(Track t) {

    }
}
