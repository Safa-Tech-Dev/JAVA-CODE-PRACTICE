package com.safatech.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWord {

        /*
        How to count each element/word from the String ArrayList in Java8?
        */
    public static void getCountedWord(List<String> names){

        Map<String, Long> collectedMap = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collectedMap);
    }
    public static void main(String[] args) {

        List<String> names = Arrays.asList("AA","BB", "CC","AA");
        getCountedWord(names);
    }
}
