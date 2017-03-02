package dev.feather.mzq;

/**
 * Created by mattias on 2017-03-02.
 */

public interface Player {

    void play(Track t);

    void stop(Track t);

    void next(Track t);

    void prev(Track t);

}
