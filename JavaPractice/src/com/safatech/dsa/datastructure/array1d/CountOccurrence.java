package com.safatech.dsa.datastructure.array;

/**
 * Count the number the frequency of the element
 */
public class CountOccurrence {

    public static int countOccurence(int[] arr, int item){

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == item){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr1 = {5,2,6,5,8,9,5};
        int item1 = 5;
        System.out.println(countOccurence(arr1,item1));
        int[] arr2 = {5,2,6,5,8,9,5};
        int item2 = 7;
        System.out.println(countOccurence(arr2,item2));
    }
}
