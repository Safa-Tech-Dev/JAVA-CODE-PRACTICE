package JavaPractice.src.com.safatech.dsa.datastructure.hashset;

import java.util.HashSet;
import java.util.Set;

public class MaxNumberOnTable {

    static int getMaxNumberOnTable(int[] nums){

        Set<Integer> table = new HashSet<>();
        int max = 0;
        for(int num : nums){

            if(table.contains(num)){
                table.remove(num);
            }else{
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] num1 = {2,1,1,3,2,3}; // 2
        int[] num2 = {1,1}; // 1
        System.out.println(getMaxNumberOnTable(num1));
        System.out.println(getMaxNumberOnTable(num2));

    }
}
