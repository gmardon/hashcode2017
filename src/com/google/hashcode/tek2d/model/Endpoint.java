package com.google.hashcode.tek2d.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gmardon on 23/02/2017.
 */
public class Endpoint {
    private int id;
    private int latency;
    private List<RequestGroup> requests;
    private List<CacheLink> links;

    public Endpoint(int id, int latency) {
        this.id = id;
        this.links = new LinkedList<>();
        this.requests = new LinkedList<>();
    }

    public List<CacheLink> getLinks() {
        return links;
    }

    public void setLinks(List<CacheLink> links) {
        this.links = links;
    }

    public List<RequestGroup> getRequests() {
        return requests;
    }

    public void setRequests(List<RequestGroup> requests) {
        this.requests = requests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }
}
