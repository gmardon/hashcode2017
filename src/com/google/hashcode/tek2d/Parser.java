package com.google.hashcode.tek2d;

import com.google.hashcode.tek2d.model.Video;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gmardon on 23/02/2017.
 */
public class Parser {
    public Parser() {

    }

    public void parseFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        List<Video> videos = new LinkedList();

        Scanner scanner = new Scanner(file);

        int videosCount = scanner.nextInt();
        int endpointsCount = scanner.nextInt();
        int requestsCount = scanner.nextInt();
        int cacheServersCount = scanner.nextInt();
        int cacheSize = scanner.nextInt();

        System.out.println("Videos count : " + videosCount);
        System.out.println("Endpoints count : " + endpointsCount);
        System.out.println("Requests count : " + requestsCount);
        System.out.println("Cache servers : " + cacheServersCount);
        System.out.println("Cache size : " + cacheSize + "MB");

        for(int i = 0; i < videosCount; i++) {
            Video video = new Video(i, scanner.nextInt());
            videos.add(video);
        }


    }
}
