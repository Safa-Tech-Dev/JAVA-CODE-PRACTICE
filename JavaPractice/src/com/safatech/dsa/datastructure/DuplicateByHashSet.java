package com.safatech.dsa.datastructure;

import java.util.HashSet;
import java.util.Set;

public class DuplicateByHashSet {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(DuplicateByHashSet.findDuplicates(nums));
    }

    private static boolean findDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i< nums.length; i++){
            if(set.contains(nums[i])){ // check if the element is there in set or not
                return true; // if there return true
            }
            set.add(nums[i]);     // else add to set
        }
        return false;

    }
}
