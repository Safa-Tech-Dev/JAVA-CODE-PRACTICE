package com.safatech.dsa.datastructure.hashmap;

import java.util.*;

/**
 *  Intersection of Two Arrays II
 *
 * Solution
 * Given two integer arrays nums1 and nums2, return an array1d of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 *
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 *
 * Follow up:
 * What if the given array1d is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionTwoArray2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));

        int[] arr3 = {4,9,5};
        int[] arr4 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr3, arr4)));

    }

    public static int[] intersect(int[] nums1, int[] nums2){

        Map<Integer, Integer> map = new HashMap<>();
        //add every element to map and increase the count if it there else 0
        for(int key : nums1){

            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<Integer> intersect = new ArrayList<>();

        //iterate over the arr nums2
        for (int key : nums2){

            //add element to list if the key is there in map and > 0
            if(map.containsKey(key) && map.get(key) > 0){
                intersect.add(key);
                //decrease the value count
                map.put(key, map.get(key) - 1);
            }
        }
        int[] result = new int[intersect.size()];
        //convert list to array1d
        for(int i = 0; i<intersect.size(); i++){

            result[i] = intersect.get(i);
        }
        return result;
    }
}
