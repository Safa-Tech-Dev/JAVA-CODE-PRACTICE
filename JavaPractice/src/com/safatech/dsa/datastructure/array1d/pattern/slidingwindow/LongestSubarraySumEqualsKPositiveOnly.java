package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.slidingwindow;

import java.util.Map;

// If array contain only +ve nnumber, use Dynamic Sliding Window
// We have to find the longest = length, here k is sum
public class LongestSubarraySumEqualsKPositiveOnly {

    public static int longestSubarray(int[] arr, int k){

        int n = arr.length;

        int windowSum = 0;
        int maxLength = 0;

        int left = 0;

        for(int right = 0; right < n; right++){

            // Expand the window to the right
            windowSum += arr[right];

            // shrink the window from left if sum exceeds k
            while (left <= right && windowSum > k){

                windowSum -= arr[left];
                left++;
            }

            // update the max if sum equals k
            if(windowSum == k){

                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }

    static void main() {

        int[] a1 = {10,5,2,7,1,9};
        int k1 = 15;
        IO.println(longestSubarray(a1,k1));
        int[] a2 = {10,5,2,7,1,9};
        int k2 = 10;
        IO.println(longestSubarray(a2,k2));
    }
}
