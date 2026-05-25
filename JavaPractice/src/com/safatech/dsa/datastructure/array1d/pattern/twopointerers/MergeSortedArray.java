package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.twopointerers;

import java.util.Arrays;

/**
 * # 88
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
public class MergeSortedArray {

     public void merge(int[] nums1, int m, int[] nums2, int n){

         // last valid index in nums1
         int  i = m - 1;

         // last valid index in nums2
         int j = n - 1;
         // last valid index in nums1 including 0's
         int k = m + n - 1;

         // Fill nums1 from the back
         while( i >= 0 && j >= 0){

             // Place larger element from nums1 or nums2
             if(nums1[i] > nums2[j]){

                 nums1[k] = nums1[i];
                 i--;
                 k--;
             }else{

                 nums1[k] = nums2[j];
                 j--;
                 k--;
             }
         }
         // if nums2 leftover, copy them to nums1
         while (j >= 0){

             nums1[k] = nums2[j];
             j--;
             k--;
         }

         // remaining nums1 are already in the correct position
         IO.println(Arrays.toString(nums1));
     }

    static void main() {

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, m, nums2, n);

    }
}
