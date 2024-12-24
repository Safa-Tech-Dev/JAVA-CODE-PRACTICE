package com.safatech.dsa.datastructure.array1d.pattern.targetsum;

/**
 * find the total no. of pairs in the array whose sum is equal to the given value x.
 */
public class TargetSumORTwoSum {

    public static int targetSum(int[] arr, int target){

        int ans = 0;
        int n = arr.length;

        for(int i = 0; i<n; i++){ // 1st number
            for(int j = i + 1; j<n; j++){ // 2nd number
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4,6,3,5,8,2};
        int target = 7;
        System.out.println(targetSum(arr,target));
        int[] arr1 = {4,6,3,5,8,2};
        int target1 = 6;
        System.out.println(targetSum(arr1,target1));
    }

}
