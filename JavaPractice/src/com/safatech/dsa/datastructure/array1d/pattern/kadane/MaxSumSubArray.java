package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.kadane;

public class MaxSumSubArray {

    // Brute force - approach
    public static int getMaxSum1(int[] arr){

        int maxSum = 0;

        for(int i = 0; i < arr.length; i++){

            int currentSum = 0;
            for (int j = i; j < arr.length; j++){
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
    // Optimal - approach
    public static int getMaxSum(int[] arr){

        int currentSum = arr[0]; // initialize index 0 as the current sum
        int maxSum = arr[0]; // initialize index 0 as the max sum

        // Traverse the over the array starting from index 1
        for(int i = 1; i < arr.length; i++){

            // Either extend the current subarray or start a new one
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // Update the global maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum = " + getMaxSum(nums)); // Output: 6
        System.out.println(getMaxSum1(nums));
    }
}
