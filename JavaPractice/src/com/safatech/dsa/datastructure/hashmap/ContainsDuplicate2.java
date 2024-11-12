package com.safatech.dsa.datastructure.hashmap;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an integer array1d nums and an integer k, return true if there are two distinct indices i and j in the array1d
 * such that nums[i] == nums[j] and abs(i - j) <= k.

 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicate2 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int k1 = 3;

        System.out.println(getDuplicate2(nums1,k1));

        int[] nums2 = {1,0,1,1};
        int k2 = 1;

        System.out.println(getDuplicate2(nums2,k2));
        int[] nums3 = {1,2,3,1,2,3};
        int k3 = 2;
        System.out.println(getDuplicate2(nums3,k3));

    }

    public static boolean getDuplicate2(int[] nums, int k){

        //create a HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over array1d nums
        for(int i = 0; i<nums.length; i++){

            //check the key is  present in the map & indeces should be <=k
            if(map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k){
                return true;
            }
            //else put it to map with index value
            map.put(nums[i],i);
        }

        return false;
    }
}
