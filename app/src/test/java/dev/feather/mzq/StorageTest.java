package dev.feather.mzq;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mattias on 2017-03-02.
 */
public class StorageTest {
    Storage storage;
    TrackList trackList;

    @Before
    public void setup() throws Exception {
        storage = new StorageImpl();
        trackList = new TrackList();
    }

    @Test
    public void store() throws Exception {
        assertTrue(storage.store(trackList));
    }

    @Test
    public void retrive() throws Exception {
        storage.store(trackList);
        assertEquals(trackList, storage.retrive());
    }

}