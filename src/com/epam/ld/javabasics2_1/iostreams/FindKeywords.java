package com.epam.ld.javabasics2_1.iostreams;

import java.io.*;
import java.util.concurrent.atomic.AtomicLong;

public class FindKeywords {

    private WordsCollector wordsCollector = new WordsCollector();

    public void checkFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            wordsCollector.processLine(line);
            line = br.readLine();
        }
    }

    public void printStatistics(PrintStream stream) {
        AtomicLong total = new AtomicLong();
        wordsCollector.getStatistics().forEach((keyword, count) -> {
            stream.println(String.format("%s -> %s", keyword.toString().toLowerCase(), count));
            total.addAndGet(count.longValue());
        });
        stream.println("TOTAL -> " + total);
    }

}
