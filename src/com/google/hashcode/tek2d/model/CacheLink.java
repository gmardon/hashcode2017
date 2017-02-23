package com.google.hashcode.tek2d.model;

/**
 * Created by gmardon on 23/02/2017.
 */
public class CacheLink {
    private CacheServer cache;
    private Endpoint endpoint;
    private int latency;

    public CacheLink(int latency, CacheServer cache, Endpoint endpoint) {
        this.latency = latency;
        this.cache = cache;
        this.endpoint = endpoint;
    }

    public CacheServer getCache() {
        return cache;
    }

    public void setCache(CacheServer cache) {
        this.cache = cache;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }
}
