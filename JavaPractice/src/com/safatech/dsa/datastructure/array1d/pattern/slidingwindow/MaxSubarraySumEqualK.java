package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.slidingwindow;

// Fixed - size Window
public class MaxSubarraySumEqualK {

    // Naive/Brute-force -- Approach
    public static int getMaxSubarraySumEqualK_1(int[] arr, int k){

        int maxSum = Integer.MIN_VALUE; // Assign min value
        int n = arr.length; // 7
        // Compute the sum of first 'k' element
        for(int i = 0; i <= n - k; i++){  // 7 - 4 = 3

            int currentSum = 0; // make current sum 0 every time when start i
            // Inner loop to sum k elements starting at i
            for (int j = i; j < i + k; j++){ // 0 + 4 = 4

                currentSum += arr[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static int getMaxSubarraySumEqualK_2(int[] arr, int k){

        int n = arr.length;
        int sum = 0;
        // Compute the sum of first 'k' element
        for (int i = 0; i < k; i++){

            sum += arr[i];
        }
        //initialize the maxMum as the sum of first window
        int maxSum = sum;
        // slide the window across the array
        for(int i = 1; i <= n - k; i++){
            // remove element leaving the window, add new element entering the window, -1 because index starts 0
            sum = sum - arr[i-1] + arr[i+k-1];
            maxSum = Math.max(maxSum, sum); // update maxSum
        }
        return maxSum;
        // return maxSum / k;  for avg sum subarray
    }

    public static void main(String[] args) {

        int[] arr = {3,8,2,5,7,6,12};
        int k = 4;
        System.out.println("max Sum " + getMaxSubarraySumEqualK_1(arr, k));
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        System.out.println("max Sum " + getMaxSubarraySumEqualK_2(nums, k1));

    }
}
