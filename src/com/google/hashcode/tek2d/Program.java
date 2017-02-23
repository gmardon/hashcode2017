package com.google.hashcode.tek2d;

import com.google.hashcode.tek2d.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gmardon on 23/02/2017.
 */
public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        new Program().process("input/kittens.in");
    }

    public void process(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        List<Video> videos = new LinkedList<>();
        List<CacheServer> cacheServers = new LinkedList<>();
        List<Endpoint> endpoints = new LinkedList<>();

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

        for (int i = 0; i < videosCount; i++) {
            Video video = new Video(i, scanner.nextInt());
            videos.add(video);
        }

        for (int i = 0; i < endpointsCount; i++) {
            Endpoint endpoint = new Endpoint(i, scanner.nextInt());
            ArrayList<CacheLink> cacheLinks = new ArrayList<>();
            int cachesCount = scanner.nextInt();
            for (int y = 0; y < cachesCount; y++) {
                int id = scanner.nextInt();
                int latency = scanner.nextInt();
                if (!cacheServers.stream().filter(s -> s.getId() == id).findFirst().isPresent()) {
                    cacheServers.add(new CacheServer(id, cacheSize));
                }
                CacheLink link = new CacheLink(latency, cacheServers.stream().filter(s -> s.getId() == id).findFirst().get(), endpoint);
                cacheServers.stream().filter(s -> s.getId() == id).findFirst().get().getLinks().add(link);
                cacheLinks.add(y, link);
            }
            endpoint.setLinks(cacheLinks);
            endpoints.add(endpoint);
        }

        for (int i = 0; i < requestsCount; i++) {
            int videoId = scanner.nextInt();
            int endpointId = scanner.nextInt();
            int requests = scanner.nextInt();

            Endpoint endpoint = endpoints.stream().filter(s -> s.getId() == endpointId).findFirst().get();
            Video video = videos.stream().filter(s -> s.getId() == videoId).findFirst().get();
            endpoint.getRequests().add(new RequestGroup(requests, video));
        }
    }
}
