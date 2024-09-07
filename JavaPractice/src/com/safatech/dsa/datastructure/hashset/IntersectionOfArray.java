package com.safatech.dsa.datastructure.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class IntersectionOfArray {

    public static void main(String[] args) {

        int[] input1 = {4,9,5};
        int[] input2 = {9,4,9,8,4};
        int[] result = IntersectionOfArray.getIntersectedArray(input1, input2);
        System.out.println(Arrays.toString(result));

    }

    private static int[] getIntersectedArray(int[] nums1, int[] nums2){

        Set<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        for(int j : nums2){
            if (set.contains(j))
                intersectionSet.add(j);
        }
        int index = 0;
        int[] result = new int[intersectionSet.size()];
        for(int key : intersectionSet){
            result[index++] = key;
        }
        return result;
    }

}
