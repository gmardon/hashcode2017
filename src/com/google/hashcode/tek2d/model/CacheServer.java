package com.google.hashcode.tek2d.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.hashcode.tek2d.utils.Utils.distinctByKey;

/**
 * Created by gmardon on 23/02/2017.
 */
public class CacheServer {
    private int id;
    private int maxSize;
    private List<CacheLink> links;
    private List<Video> videos;

    public CacheServer(int id, int maxSize) {
        this.id = id;
        this.maxSize = maxSize;
        this.links = new LinkedList<>();
        this.videos = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Video> getVideosBySize() {
        LinkedList<Video> videos = new LinkedList<>();
        for(CacheLink link : links) {
            for (RequestGroup group : link.getEndpoint().getRequests()) {
                videos.add(group.getVideo());
            }
        }
        videos = videos.stream().filter(distinctByKey(v -> v.getId())).collect(Collectors.toCollection(LinkedList::new));
        videos.sort(Comparator.comparingInt(Video::getSize));
        return videos;
    }

    public List<CacheLink> getLinks() {
        return links;
    }

    public void setLinks(List<CacheLink> links) {
        this.links = links;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public int getActualSize() {
        return this.videos.stream().mapToInt(Video::getSize).sum();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
