package dev.feather.mzq;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mattias on 2017-03-02.
 */
public class TrackTest {
    TrackImpl track;

    @Before
    public void setup() throws Exception {
        track = new TrackImpl("Test", 100);
    }

    @Test
    public void name() throws Exception {
        assertNotNull(track.name());
    }

    @Test
    public void length() throws Exception {
        assertEquals(100, track.length());
    }

}