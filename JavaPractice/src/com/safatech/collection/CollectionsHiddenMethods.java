package com.safatech.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsHiddenMethods {

    public static void main(String[] args) {

        //Collections.nCopies(); it will create a copy of string in the list. it is immutable
        List<String> names = Collections.nCopies(5, "Safa-Tech");
        System.out.println(names);
        try{

            names.set(0, "solution");
        }catch (UnsupportedOperationException e){
            System.out.println("List is immutable, It can't be modified.");
        }

        //Collections.frequency(); count the repeatations
        List<Integer> numbers = Arrays.asList(1,2,3,5,4,8,9,3,4,3,4,5,6,7,8,6,5,4,3);
        int tobeCount = 4;
        int count = Collections.frequency(numbers, tobeCount);
        System.out.println(tobeCount + " repeated " + count + " times ");

        //find the occurrence of each number in a list
        Map<Integer, Integer> frequencyMap = numbers.stream()
                .collect(Collectors.toMap(
                        number -> number,
                        number -> Collections.frequency(numbers, number),
                        (existingValue, newValue) -> existingValue
                ));
        System.out.println(frequencyMap);

        //Collections.disjoint(); it will check whether two collections have common elements

        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1,2,3,4,5);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 6,7,8,9,0);
        boolean areDisjoint = Collections.disjoint(list1, list2);
        if (areDisjoint){
            System.out.println("Collection has no common element");
        }else{
            System.out.println("Collection has common element");
        }

        //Collections.singleton; it will create immutable set that contains only single element
        Set<String> singleton = Collections.singleton("Safa-tech");
        try{

            singleton.add("solution");
        }catch (UnsupportedOperationException e){
            System.out.println("singletone is immutable, It can't be modified.");
        }

        //Collections.rotate(); It will rotate the element by kth position from left/right(+ve right, -ve left)

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            list.add(i);
        }
        System.out.println("Original list: " + list);
        Collections.rotate(list,3); // right rotation
        System.out.println(list);
        System.out.println("Original list: " + list);
        Collections.rotate(list,-3); // left rotation
        System.out.println(list);
        Collections.rotate(list,list.size()); // left rotation
        System.out.println(list);
        Collections.rotate(list,-15); // left rotation
        System.out.println(list);


    }
}
