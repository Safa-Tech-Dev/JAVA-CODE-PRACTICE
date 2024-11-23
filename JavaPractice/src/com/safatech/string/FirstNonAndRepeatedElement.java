package com.safatech.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedElement {

    public static void getFirstNonRepeated(String str){

        String firstNonRepeated = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(firstNonRepeated);
    }
    public static void main(String[] args) {
        String str = "ILoveDawateIslami";
        getFirstNonRepeated(str);
    }
}
