package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {

    // Brute-Force, Naive Solution
    public static int subarraySum1(int[] arr, int k){

        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            int prefixSum = 0;
            for(int j = i; j < arr.length; j++){
                prefixSum += arr[j];
                if(prefixSum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    // Optimal - with HashMap<>()
    public static int subarraySum2(int[] arr, int k){

        Map<Integer, Integer> sumCountMap = new HashMap<>();
        int prefixSum = 0, cnt = 0;
        for (int i = 0; i < arr.length; i++){

            prefixSum += arr[i];

            int sumRemoved = prefixSum - k;
            if(sumCountMap.containsKey(sumRemoved)){

                cnt += sumCountMap.get(sumRemoved) + 1;
            }
            sumCountMap.put(prefixSum,  sumCountMap.getOrDefault(prefixSum,0)+1);
        }
         return cnt;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,1,1};
        int k1 = 2;
        System.out.println("subarray: " + subarraySum2(nums1, k1));
        int[] nums2 = {1,2,3};
        int k2 = 3;
        System.out.println("subarray: " + subarraySum2(nums2, k2));
    }
}
