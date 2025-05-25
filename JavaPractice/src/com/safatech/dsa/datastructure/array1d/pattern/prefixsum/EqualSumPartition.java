package com.safatech.dsa.datastructure.array1d.pattern.prefixsum;

public class  EqualSumPartition {

    public static int getArraySum(int[] arr){

        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){

            totalSum += arr[i];
        }
        return totalSum;
    }
    public static boolean getEqualSumPartition(int[] arr){

        int totalSum = getArraySum(arr);
        int prefixSum = 0;
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(prefixSum == suffixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        System.out.println("Equal partition possible? " + getEqualSumPartition(arr1));
        int[] arr2 = {1,3,5,6,2,1};
        System.out.println("Equal partition possible? " + getEqualSumPartition(arr2));

    }
}
