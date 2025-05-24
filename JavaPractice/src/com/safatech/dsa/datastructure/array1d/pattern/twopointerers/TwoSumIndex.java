package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.Arrays;

public class TwoSumIndex {

    public static int[] getTwoSumIndex(int[] arr, int target){

        int n = arr.length;
        int left = 0, right = n - 1;

        while(left < right){

            // Sum calculation
            int sum = arr[left] + arr[right];
            if(sum == target){

                // return index, since array is 1 based indexing
                return new int[]{left+1, right+1};
            } else if (sum < target) {  // sum is smaller than target
                left++;
            }else {
                right--; // sum is greater than target
            }
        }
        return new int[0]; // no sum match
    }

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println("Target Sum: " + Arrays.toString(getTwoSumIndex(arr, target)));
    }
}
