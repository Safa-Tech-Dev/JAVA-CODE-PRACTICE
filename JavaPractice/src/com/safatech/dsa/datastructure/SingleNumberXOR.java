package com.safatech.dsa.datastructure;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
public class SingleNumberXOR {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        System.out.println(SingleNumberXOR.getSingleNumber(nums));

    }

    private static int getSingleNumber(int[] nums){

        int temp = 0;
        for (int i = 0; i< nums.length; i++){

            temp ^= nums[i];
        }
        return temp;
    }
}
