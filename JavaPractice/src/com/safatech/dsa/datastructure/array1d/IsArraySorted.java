package com.safatech.dsa.datastructure.array1d;

/**
 * Check the array  is sorted or not
 */
public class IsArraySorted {

    public static boolean isSorted(int[] arr){

        boolean isSorted = true;
        for(int i = 1; i<arr.length; i++){

            if(arr[i-1] > arr[i]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
    public static void main(String[] args) {

        int[] arr1 = {0,1,3,5,6,2,8,9,5}; //not sorted
        System.out.println(isSorted(arr1));
        int[] arr2 = {0,1,3,5,6,8,9};
        System.out.println(isSorted(arr2)); //sorted
    }
}
