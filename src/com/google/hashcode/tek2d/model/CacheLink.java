package com.google.hashcode.tek2d.model;

/**
 * Created by gmardon on 23/02/2017.
 */
public class CacheLink {
    private CacheServer cache;
    private int latency;

    public CacheLink(int latency, CacheServer cache) {
        this.latency = latency;
        this.cache = cache;
    }
}
