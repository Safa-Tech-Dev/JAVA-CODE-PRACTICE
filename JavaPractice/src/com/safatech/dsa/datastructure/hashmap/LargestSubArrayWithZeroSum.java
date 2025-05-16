package JavaPractice.src.com.safatech.dsa.datastructure.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithZeroSum {

    static int getLargestSubArrayWithZeroSum(int[] arr){

        // prefixSum, index
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0, prefixSum = 0;
//        map.put(0, -1);
        for(int i = 0; i<arr.length; i++){

            prefixSum += arr[i];
            if(prefixSum == 0){
                maxLength = i + 1;
            }
            if(map.containsKey(prefixSum))
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            else
                map.put(prefixSum, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};// Largest subarray with 0 sum: -2,2,-8,1,7, length:5
        System.out.println(getLargestSubArrayWithZeroSum(arr1));
        int[] arr2 = {2, 10, 4};
        System.out.println(getLargestSubArrayWithZeroSum(arr2)); //Output: 0: Explanation: There is no subarray with a sum of 0.
        int[] arr3 = {1, 0, -4, 3, 1, 0};
        System.out.println(getLargestSubArrayWithZeroSum(arr3)); // Output: 5: Explanation: The subarray is [0, -4, 3, 1, 0]

    }
}
