package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (accumulator, number) -> number);
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce("", (accumulator, word) -> word.length() > accumulator.length() ? word : accumulator);
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
                .map(String::length)
                .reduce(0, Integer::sum);

//               .reduce(0, (accumulator, word) -> accumulator + word);
    }
}
