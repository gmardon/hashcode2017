package com.google.hashcode.tek2d.model;

import java.util.List;

/**
 * Created by aurelien on 23.02.17.
 */
public class Submission {
    private int nb_cache_used;
    private List<CacheServer> cache_list;
    //private List<Integer> cache_content;

    public Submission()
    { this.nb_cache_used = 0;}

    public int getNbCache() {return nb_cache_used;}
    public void setNbCache(int nb_cache) {this.nb_cache_used = nb_cache;}

    public void addCacheContent(int cache_id, int video_id)
    {
        this.cache_content.get(cache_id).addVideo;
        this.nb_cache_used = this.cache_content.length();
    }

    public List<Video> getCacheContent(int cache_id)
    { return cache_list.get(cache_id).getVideoList; }

    //public
}
