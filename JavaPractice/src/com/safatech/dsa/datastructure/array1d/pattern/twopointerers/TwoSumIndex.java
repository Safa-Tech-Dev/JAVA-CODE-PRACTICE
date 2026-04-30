package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndex {

    // Input array is sorted, Use two approach
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
    public static int[] getTwoSumIndexNotSortedArray(int[] arr, int target){

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            int pair = target - arr[i];
            if(map.containsKey(pair) && map.get(pair) != i){

                return new int[]{map.get(pair),i};
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println("Target Sum: " + Arrays.toString(getTwoSumIndex(arr, target)));
        IO.println(Arrays.toString(getTwoSumIndexNotSortedArray(arr,target)));
    }
}
