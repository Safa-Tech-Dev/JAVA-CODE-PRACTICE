package JavaPractice.src.com.safatech.dsa.datastructure.hashset;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    static int getLongestConsecutive(int[] nums){

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxStreak = 0;
        for(int num : set){

            if(!set.contains(num - 1)){ // num is the starting point of sequence

                int currentNum = num; // 1
                int currentStreak = 1; // length of current consecutive sequence
                while (set.contains(currentNum + 1)){
                    currentStreak++;
                    currentNum++;
                }
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {

        int[] num1 = {100,4,200,1,3,2}; // Longest consecutive sequence  is {1,2,3,4} so o/p : 4
        int[] num2 = {0,3,7,2,5,8,4,6,0,1}; // Longest consecutive sequence  is {0,1,2,3,4,6,7,8} so o/p : 9
        System.out.println(getLongestConsecutive(num1));
        System.out.println(getLongestConsecutive(num2));
    }
}
