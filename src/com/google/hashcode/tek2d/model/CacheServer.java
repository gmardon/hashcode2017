package com.google.hashcode.tek2d.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gmardon on 23/02/2017.
 */
public class CacheServer {
    private int id;
    private int maxSize;
    private List<Video> videos;

    public CacheServer(int id, int maxSize) {
        this.id = id;
        this.maxSize = maxSize;
        this.videos = new LinkedList<Video>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
