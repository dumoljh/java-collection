package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return 0;
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce("",(s, s2) -> s2.length() > s.length() ? s2 : s);
    }

    public int getTotalLength(List<String> words) {
        return 0;
    }
}
