package JavaPractice.src.com.safatech.dsa.datastructure.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * # 128
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore, its length is 4.
 */
public class LongestConsecutiveSequence {

    public int  getConsecutiveSequence(int[] nums){

        int n = nums.length;

        int length = 0;
        Set<Integer> seen = new HashSet<>();

        // Add all elements to set to remove duplicates
        for(int i = 0; i < n; i++){

            seen.add(nums[i]);
        }

        // loop through each element in set to find the starting point of consecutive sequence
        for(int num : seen){

            // if there is no number before 'num', it is the start of a sequence
            if(!seen.contains(num - 1)){

                // start the count for this sequence
                int count = 1;

                // store the current number
                int currNum = num;

                // Keep checking the next consecutive number
                while(seen.contains(currNum + 1)){

                    // Move to the next number in sequence
                    currNum += 1;

                    // increment the length for the current sequence
                    count += 1;
                }

                // update the longest sequence length
                length = Math.max(length, count);
            }
        }
        return length;
    }
    static void main() {

        int[] nums = {100,4,200,1,3,2};
        LongestConsecutiveSequence sequence = new LongestConsecutiveSequence();

        IO.println(sequence.getConsecutiveSequence(nums));
    }
}
