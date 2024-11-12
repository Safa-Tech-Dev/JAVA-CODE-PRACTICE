package com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

public class SortArraySquared {

    public static int[] sortSquared(int[] arr){

        int n = arr.length,
                left = 0,
                right = n -1,
                k = n - 1; // start filling the ans arr from right so that no need to reverse
        int[] ans = new int[n];

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void print(int[] arr){

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {-10,-5,1,2,3};
        System.out.println("Original array1d:");
        print(arr1);
        int[] ans = sortSquared(arr1);
        System.out.println("Sorted array1d:");
        print(ans);

        int[] arr2 = {-1,-2,-3,-4,-5,-6,-7};
        System.out.println("Original array1d:");
        print(arr2);
        int[] ans2 = sortSquared(arr2);
        System.out.println("Sorted array1d:");
        print(ans2);
    }
}
