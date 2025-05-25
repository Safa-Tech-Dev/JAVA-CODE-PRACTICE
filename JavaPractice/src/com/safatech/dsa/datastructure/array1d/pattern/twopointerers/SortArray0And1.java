package com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

/**
 * Problem 1 : Move 0 to the left and 1 to the right
 * input : 1,0,1,0,1,0,1,0,1,0
 * output : 0 0 0 0 0 1 1 1 1 1
 */
public class SortArray0And1 {

    public static void print(int[] arr){

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int  j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortZeroesAndOnes(int[] arr){

        int n = arr.length;
        int left = 0, right = n -1;
        while (left < right){

            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }
   /* public static void sortZeroesAndOnes(int[] arr){

        int zeroes = 0;
        int n = arr.length;
        //count number of zeroes
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }

        // 0 to zeroes - 1: 0 and zeroes to n - 1: 1
        for(int i = 0; i < n; i++){
            // if i < count of zeroes
            if(i< zeroes){
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }

    }*/
    public static void main(String[] args) {

        int[] arr = {1,0,1,0,1,0,1,0,1,0};
        System.out.println("Original array:");
        print(arr);
        sortZeroesAndOnes(arr);
        System.out.println("Sorted array:");
        print(arr);
    }
}
