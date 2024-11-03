package com.safatech.dsa.datastructure.array.pattern.twopointerers;

/**
 * Problem  : Move even to the left and odd to the right(parity)
 * input : 1,2,3,4,5,6,7
 * output : 2,4,6,1,3,5,7
 */
public class SortArrayEvenOdd {

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

    public static void sortEvenOdd(int[] arr) {

        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right){

            if(arr[left] % 2 != 0 && arr[right] % 2 == 0 ){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 != 0){
                right--;
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Original array:");
        print(arr);
        sortEvenOdd(arr);
        System.out.println("Sorted array:");
        print(arr);
    }
}
