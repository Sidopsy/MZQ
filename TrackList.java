package dev.feather.mzq;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mattias on 2017-03-02.
 */
public class TrackList extends ArrayList {
    ArrayList<Track> tracks;

    public TrackList(){
        tracks = new ArrayList<>();
    }

    public void add(Track t){
        tracks.add(t);
    }

    public ArrayList<Track> get(){
        return tracks;
    }
}
