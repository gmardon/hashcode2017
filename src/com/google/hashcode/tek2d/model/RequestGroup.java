package com.google.hashcode.tek2d.model;

/**
 * Created by gmardon on 23/02/2017.
 */
public class RequestGroup {
    private Video video;
    private int size;

    public RequestGroup(int size, Video video) {
        this.size = size;
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
