package com.epam.ld.javabasics2_1.iostreams;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FindKeywords findKeywords = new FindKeywords();
        findKeywords.checkFile("BufferedReader.java.txt");
        findKeywords.printStatistics(System.out);
    }
}
