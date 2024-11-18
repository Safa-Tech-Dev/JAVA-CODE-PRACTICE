package com.safatech.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNUniqueJava8 {

      /*
       How to find duplicate elements in a given integers list in java using Stream functions?
      */
    public static void findDuplicateInArray(Integer[] arr){

        Set<Integer> uniqueNumber = new HashSet<>();
        List<Integer> integerList = Arrays.asList(arr);
        Set<Integer> duplcateNumber = integerList.stream().filter(n -> !uniqueNumber.add(n)).collect(Collectors.toSet());
        System.out.println("Original : " + Arrays.toString(arr));
        System.out.println("Unique : " + uniqueNumber);
        System.out.println("Duplicate : " + duplcateNumber);

        // using Collections.frequency()
        Set<Integer> duplicateUsingFreq = integerList.stream()
                .filter(n -> Collections.frequency(integerList, n) > 1)
                .collect(Collectors.toSet());
        System.out.println("Duplicate using Frequecy: " + duplicateUsingFreq);

    }
    public static void findDupicateInString(String str){

        Set<String> uniqueCharacter = new HashSet<>();
        Map<String, Long> mapOfLetter = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapOfLetter);

        List<String> duplicateLetter = mapOfLetter.entrySet().stream() // stream can not be applied to map, so convert it to entryset is used.
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Duplicate letter : " + duplicateLetter);

    }
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{12,34,12,5,5,23};
        findDuplicateInArray(arr);
        System.out.println("============ String ===============");
        String str = "ILoveDawateIslami";
        findDupicateInString(str);
    }
}
