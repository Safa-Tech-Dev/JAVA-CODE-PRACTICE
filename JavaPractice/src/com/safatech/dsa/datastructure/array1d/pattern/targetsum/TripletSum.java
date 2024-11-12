package com.safatech.dsa.datastructure.array.pattern.targetsum;

/**
 * count no. of triplets in the array whose sum is equal to the given value x.
 */
public class TripletSum {

    public static int tripletSum(int[] arr, int target){

        int n = arr.length;
        int ans = 0;

        for(int i = 0; i<n; i++){ // 1st number
            for(int j = i + 1; j<n; j++){ //2nd number
                for(int k = j + 1; k<n; k++){ //3rd number

                    if(arr[i] + arr[j] + arr[k] == target){

                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {1,4,5,6,3};
        int target = 12;// {1,5,6}, {4,5,3}
        System.out.println(tripletSum(arr,target));

    }
}
