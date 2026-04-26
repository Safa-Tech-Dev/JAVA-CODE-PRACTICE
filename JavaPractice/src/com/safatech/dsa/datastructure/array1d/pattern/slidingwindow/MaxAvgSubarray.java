package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.slidingwindow;

/**
 *
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
public class MaxAvgSubarray {

    public static double findMaxAvg(int[] arr, int k){

        int n = arr.length;;
        int sum = 0;
        // find sum of the first k elements
        for(int i = 0; i < k; i++){

            sum += arr[i];
        }

        // initialize the maximum sum of the first window
        double maxSum = sum;

        // slide the window across the array
        for(int i = k; i < n; i++){

            // add element entering the window, remove element leaving the window
            sum += arr[i] - arr[i-k];
            // update the maximum sum
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k;
    }

    static void main() {

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        IO.println(findMaxAvg(nums,k));
    }
}
