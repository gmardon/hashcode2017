package com.google.hashcode.tek2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by gmardon on 23/02/2017.
 */
public class Parser {
    public Parser() {

    }

    public void parseFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);

        int videosCount = scanner.nextInt();
        int endpointsCount = scanner.nextInt();
        int requestsCount = scanner.nextInt();
    }
}
