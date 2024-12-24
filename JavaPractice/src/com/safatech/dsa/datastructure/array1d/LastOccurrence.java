package com.safatech.dsa.datastructure.array1d;
/**
 * Check the last occurrence of the element in an array
 */
public class LastOccurrence {

    public static int lastOccurrence(int[] arr, int item){

        int lastIndex = - 1;

        for(int i = 0; i<arr.length; i++){

            if(arr[i] == item){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {

        int[] arr1 = {5,2,6,5,8,9,5};
        int item1 = 5;
        System.out.println(lastOccurrence(arr1,item1));
        int[] arr2 = {5,2,6,5,8,9,5};
        int item2 = 7;
        System.out.println(lastOccurrence(arr2,item2));

    }
}
