package JavaPractice.src.com.safatech.dsa.datastructure.priorityqueue.pattern.topk;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 */
public class KthLargestElement {

    // T.c = O(nlogn)
    public static int getKthLargestElement_Naive(int[] nums, int k){

        int n = nums.length; // T.c = O(1)
        Arrays.sort(nums); // Dual-privot QuickSort, (O(nlogn)
        return nums[n - k]; // T.c = O(1)
    }

    // Using PriorityQueue , minHeap Time Complexity = O(nlogk), Space Complexity = O(k)
    public static int getKthLargestElement(int[] nums, int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){

            minHeap.add(nums[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
    public static void main(String[] args) {

        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;
        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println(getKthLargestElement_Naive(nums1,k1));
        System.out.println(getKthLargestElement_Naive(nums2,k2));
        System.out.println(getKthLargestElement(nums1,k1));
        System.out.println(getKthLargestElement(nums2,k2));

    }

}
