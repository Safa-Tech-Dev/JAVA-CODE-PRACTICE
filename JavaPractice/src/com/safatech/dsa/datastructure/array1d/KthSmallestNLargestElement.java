package com.safatech.dsa.datastructure.array1d;

import java.util.Arrays;

public class KthSmallestNLargestElement {

    public static int[] kthSmallestNLargestElement(int[] arr, int k){

        Arrays.sort(arr);
        int[] ans = {arr[k-1], arr[arr.length - k]};
        return ans;

    }
    public static void main(String[] args) {

        int[] arr = {3,2,1,5,6,4}; // 1,2,3,4,5,6
        int k = 2;
        System.out.println(Arrays.toString(kthSmallestNLargestElement(arr,k)));
    }
}
