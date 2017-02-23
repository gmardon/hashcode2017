package com.google.hashcode.tek2d.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by gmardon on 23/02/2017.
 */
public class CacheServer {
    private int id;
    private int maxSize;
    private List<CacheLink> links;

    public CacheServer(int id, int maxSize) {
        this.id = id;
        this.maxSize = maxSize;
        this.links = new LinkedList<CacheLink>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Video> getVideos() {
        LinkedList<Video> videos = new LinkedList<>();
        for(CacheLink link : links) {
            link.getEndpoint().getRequests().forEach(r -> videos.add(r.getVideo()));
        }
        videos.sort(Comparator.comparingInt(Video::getSize));
        return videos;
    }

    public List<CacheLink> getLinks() {
        return links;
    }

    public void setLinks(List<CacheLink> links) {
        this.links = links;
    }
}
