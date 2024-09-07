package com.safatech.dsa.datastructure.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] nums3 = {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(getTwoSumIndex(nums1, target1)));
        System.out.println(Arrays.toString(getTwoSumIndex(nums2, target2)));
        System.out.println(Arrays.toString(getTwoSumIndex(nums3, target3)));
    }
    public static int[] getTwoSumIndex(int[] nums, int target){

        System.out.println("+++++++++++++ Printing Two Sum +++++++++");
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int complement = target - nums[i]; // 9 - 2 = 7
            if(m.containsKey(complement) && m.get(complement) != i){
                return new int[]{m.get(complement),i};
            }else{
                m.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}
