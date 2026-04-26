package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.slidingwindow;

import java.util.Arrays;

/**
 * ip nums = {1,2,3,4,5}, k = 3
 * op = {1,3,6,9,12}
 */
public class WindowSumKEpam {


    public static int[] findWindowSum(int[] arr, int k){

        int n = arr.length;
        int[] result = new int[n];
        int windowSum = 0;

        //  // find sum of the first k elements
        for(int i = 0; i < k; i++){

            windowSum += arr[i];
            result[i] = windowSum;
        }
        // slide the window across the array
        for(int i = k; i < n; i++){

            // add element entering the window, remove element leaving the window
            windowSum += arr[i] - arr[i-k];
            result[i] = windowSum;
        }
        return result;
    }

    static void main() {

        int[] nums = {1,2,3,4,5};
        int k = 3;
        IO.println(Arrays.toString(findWindowSum(nums, k)));
    }
}
