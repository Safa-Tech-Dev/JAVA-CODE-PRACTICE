package com.safatech.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateByHashSet {

    public static void main(String[] args) {

        List<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(12);
        listOfNums.add(1);
        listOfNums.add(12);
        listOfNums.add(25);
        System.out.println(DuplicateByHashSet.findDuplicates(listOfNums));
    }

    private static boolean findDuplicates(List<Integer> keys) {

        Set<Integer> set = new HashSet<>();

        for (Integer i : keys){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;

    }
}
