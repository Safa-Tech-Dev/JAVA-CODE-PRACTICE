package JavaPractice.src.com.safatech.dsa.datastructure.priorityqueue.pattern.topk;

import java.util.*;

public class KMostFrequentElement {

    //Naive approach, T.C  = O(nlogn) due to sorting
    public static int[] getKMostFrequentElement(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // make a list of entry map
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        // sort the value in Descending order
        entryList.sort((a,b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for(int i = 0; i<k; i++){

            result[i] = entryList.get(i).getKey();
        }
        return result;
    }

    // Optimal approach, T.C = O(nlogk), S.C = O(n+k)
    public static int[] topKFrequent(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // make a PriorityQueue of entry map
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>
                ((a, b)-> a.getValue() - b.getValue());

        // check the top k element
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            minHeap.add(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        // Add Tok k element in result
        for(int i = 0; i < k; i++){
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k =2;
        System.out.println(Arrays.toString(getKMostFrequentElement(nums,k)));
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
