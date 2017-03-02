package dev.feather.mzq;

import java.util.ArrayList;

/**
 * Created by mattias on 2017-03-02.
 */

public interface Storage {

    boolean store(TrackList trackList);

    TrackList retrive();

}
