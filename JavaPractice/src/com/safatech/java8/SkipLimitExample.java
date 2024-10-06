package com.safatech.java8;

import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class SkipLimitExample {

    public static void main(String[] args) throws IOException {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .skip(2)
                .limit(7)
                .forEach(System.out::print);

        System.out.println("\n"+"============================================");
        List<String> dataFile = Files.readAllLines(Paths.get("data.txt"));

        dataFile.stream()
                .skip(1) // remove the header line
                .limit(dataFile.size()-2) // remove the footer line
                .forEach(System.out::println);


        //Find the second Highest element from the Array
        System.out.println("******* Printing Second Highest Element ********");
        int[] array = {5,9,11,2,8,21,1}; // also check coreJava code

        int higest2nd = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder()) // by default it sort in increasing order
                .skip(1)
                .findFirst()
                .get();
        System.out.println(higest2nd);


        //retrieve the last element from a list of strings
        System.out.println("****** Printing last element *******");
        List<String> listOfString = Arrays.asList("One","Two","Three","Four","Five","six");

        String lastString = listOfString.stream()
                .skip(listOfString.size() - 1)
                .findFirst()
                .get();
        System.out.println(lastString);


       //skip and limit example (2 - 9)
        System.out.println("***** Printing Skip() and Limit() ********");

        IntStream.rangeClosed(1,10)
                .skip(5) // 5 tak skip ( 1, 2, 3, 4 ,5)
                .limit(2) // 2 element print hoga
                .forEach(System.out::print);

    }

}
