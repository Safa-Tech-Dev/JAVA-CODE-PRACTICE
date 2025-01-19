package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/*
Given an integer array nums, return true if any value appears
at least twice in the array, and return false if every element is distinct.
*/
public class DuplicateInArray {

    public static boolean checkDuplicate(int[] arr){

        List<Integer> listArray = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(listArray);
        if(set.size() == listArray.size()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(checkDuplicate(nums));
    }
}
