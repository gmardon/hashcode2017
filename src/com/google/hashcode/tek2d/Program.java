package com.google.hashcode.tek2d;

import java.io.FileNotFoundException;

/**
 * Created by gmardon on 23/02/2017.
 */
public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        Parser parser = new Parser();
        parser.parseFile("input/kittens.in");
    }
}
