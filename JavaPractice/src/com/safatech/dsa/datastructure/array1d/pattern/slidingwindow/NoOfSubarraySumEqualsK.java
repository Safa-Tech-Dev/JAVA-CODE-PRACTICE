package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * #560
 * Prefix sum + HashMap, becuase array contents both +ve, -ve
 */
public class NoOfSubarraySumEqualsK {

    public static int countSubarraySum(int[] arr, int k){

        int n = arr.length;
        int count = 0;

        int prefixSum = 0;

        // store the prefix sum index
        Map<Integer, Integer> prefixSumCount = new HashMap<>();

        prefixSumCount.put(0,1);
        for(int i = 0; i < n; i++){

            prefixSum += arr[i];

            // sub-arraysum = p[j] - p[i-1]
            // k = p[j] - p[i-1]
            // p[i-1] = p[j] - k
            // remove = prefixSum - k
            int remove = prefixSum - k;
            // If this sum was seen before, add its count to result
            if(prefixSumCount.containsKey(remove)){

                count += prefixSumCount.get(remove);
            }
            // update the count of current prefixSum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        // return the total sub-array
        return count;

    }

    static void main() {

        int[] arr1 = {1,1,1};
        int k1 = 2;
        IO.println(countSubarraySum(arr1,k1));
    }
}
