package JavaPractice.src.com.safatech.dsa.datastructure.priorityqueue.pattern.topk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

//Given an integer array nums and an integer k, return the k largest element in the array.
// arr = [5,9,3,4,8,2,], k = 3
// o/p = [5,8,9]

//Time Complexity = O(nlogk)
//Space Complexity = O(k)
public class TopKLargestElement {

    public static int[] findTopKLargestElement(int[] nums, int k){

        //1. Create min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //2. add first k element in minHeap to maintain the top k elements[T.C = O(klogk]
//        for(int i = 0; i < k; i++){
//            minHeap.add(nums[i]);
//        }

        //3. add elements [T.C = nlogk]
        for(int i =  0; i < nums.length; i++){

            minHeap.add(nums[i]); // add the element to heap
            if(minHeap.size() > k){ // if size is > k, remove the smallest element from the heap
                minHeap.poll(); // This keeps only k largest element in the minHeap
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = minHeap.poll();
        }
        return result;
    }

    public static void findTopKLargestElement_NaiveApproach(int[] nums, int k){

        // Wrap it to Integer class , Box it
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Sort it in Descending order
        Arrays.sort(arr, Comparator.reverseOrder());
        // print the first k elements
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        int[] arr = {5,9,3,4,8,2};
        int k = 3;
        System.out.println(Arrays.toString(findTopKLargestElement(arr,k)));
        findTopKLargestElement_NaiveApproach(arr,k);
    }
}
