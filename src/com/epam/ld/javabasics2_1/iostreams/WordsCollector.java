package com.epam.ld.javabasics2_1.iostreams;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCollector {

    private Map<ReservedWord, LongAdder> statistics = new HashMap<>();
    private static final Pattern pattern = Pattern.compile("(?s)\\b[a-z]+\\b");

    public Map<ReservedWord, LongAdder> getStatistics(){
        return Collections.unmodifiableMap(statistics);
    }

    private LongAdder getCounter(ReservedWord word) {
        LongAdder counter = statistics.get(word);
        if (counter == null) {
            counter = new LongAdder();
            statistics.put(word, counter);
        }
        return counter;
    }

    public void processLine(String line) {
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            ReservedWord keyword = ReservedWord.getReservedWord(matcher.group());
            if (keyword != null) {
                getCounter(keyword).increment();
            }
        }
    }

}
