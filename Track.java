package dev.feather.mzq;

/**
 * Created by mattias on 2017-03-02.
 */
public interface Track {

    String name();

    void forward();

    void backward();

    int length();
}
