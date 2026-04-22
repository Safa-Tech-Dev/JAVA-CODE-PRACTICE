package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode #525
 * array contents +ve, -ve, and 0 = Sliding Window will not
 * prefixSum + HashMap
 */
public class LongestSubarrayWithZeroSum {

    public static int maxLength(int[] arr){

        int n = arr.length;

        int maxLen = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumIndex = new HashMap<>();

        for(int i = 0; i < n; i++){

            // calculate prefix sum / running sum
            prefixSum += arr[i];

            // sum zero, return max length
            if(prefixSum == 0){

                maxLen = i + 1;

            // check if this sum is seen before, when seen ,zero sum segment b/w index
            } else if (prefixSumIndex.containsKey(prefixSum)) {

                int len = prefixSumIndex.get(prefixSum);

                maxLen = Math.max(maxLen, i - len);
            }else {

                // first time seen, put in map
                prefixSumIndex.put(prefixSum,i);
            }
        }
        return maxLen;
    }

    static void main() {

        int[] arr = {1, 2, -3, 3, -1, -2, 4};
        int k = 3;
        IO.println(maxLength(arr));
    }
}
