package com.safatech.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonAndRepeatedElement {

    public static void getFirstNonRepeated(String str){

        String firstNonRepeated = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(firstNonRepeated);
    }

     /*
     Find First Repeated Element from the String
     */
    public static void getFirstRepeated(String str){

        String firstRpeated = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .findFirst().get().getKey();
        System.out.println(firstRpeated);
    }
    public static void main(String[] args) {
        String str = "ILoveDawateIslami";
        System.out.println("first Non Repeated ");
        getFirstNonRepeated(str);
        System.out.println("first Repeated: ");
        getFirstRepeated(str);
    }
}
