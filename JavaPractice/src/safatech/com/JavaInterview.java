package safatech.com;

import javax.sound.midi.Soundbank;
import java.util.*;

public class JavaInterview {
    public static void main(String[] args) {

        /*
         Rotate the array by k times;
         int[] nums = {1,2,3,4,5,6,7};
         k = 3;
         Output: [5,6,7,1,2,3,4]
         */
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("************* Printing the Rotated Array **************");
        JavaInterview.rotateArray(arr,k);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


        /*
        Printing Isogram or not = Which does not contain any duplicate characters
         */
        System.out.println();
        System.out.println(JavaInterview.isIsogram("codedecode"));

        /*
        Finding the nth element in the Fibonacci series
         */
        System.out.println("******* Finding the n-th element in the Fibonacci series ****");
        System.out.println(JavaInterview.fibonacci(10));

        /*
        Find the duplicate Character in a String
         */
        System.out.println(JavaInterview.findDuplicateUsingFor_Map("codedecode"));

        /*
         // Find the first non-repeating charater's index
         */
        System.out.println(JavaInterview.nonRepeatingCharacter("codec"));
        /*
         Given an array of integers, return the indices of the two numbers
         whose sum is equal to a given target.
         You may assume that each input would have exactly one solution,
          and you may not use the same element twice.
          Given nums = [2, 7, 11, 15], target = 9
          The output should be [0, 1].
          Because nums[0] + nums[1] = 2 + 7 = 9
         */
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(JavaInterview.twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){

        System.out.println("+++++++++++++ Printing Two Sum +++++++++");
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int complement = target - nums[i];
            if(m.containsKey(complement) && m.get(complement) != i){
                return new int[]{m.get(complement),i};
            }else{
                m.put(nums[i],i);
            }
        }
        return new int[] {};
    }

    public static Set<Character> findDuplicateUsingFor_Map(String name){

        System.out.println(" ***** Printing the Duplicates character ******");
        Set<Character> duplicates = new LinkedHashSet<>();
        HashMap<Character, Integer> countMap = new HashMap<>();

        for(int i = 0; i< name.length(); i++){

            if(countMap.containsKey(name.charAt(i)))
                countMap.put(name.charAt(i), countMap.get(name.charAt(i)) + 1);
            else
                countMap.put(name.charAt(i), 1);

        }
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){

            if(entry.getValue() > 1)
                duplicates.add(entry.getKey());
        }
        return duplicates;
    }

    // Find the first non-repeating charater's index
    public static int nonRepeatingCharacter(String s){

        System.out.println("***** Printing the first non-repeating charater's Index ******");
        Map<Character, Integer> mapCount = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            if(mapCount.containsKey(s.charAt(i))){
                mapCount.put(s.charAt(i), mapCount.get(s.charAt(i)) + 1);
            }else{
                mapCount.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : mapCount.entrySet()){

            if(entry.getValue() == 1){
                return entry.getValue();
            }
        }
        return -1;
    }
    /*
    reverse the array
     */
    static void reverseArray(int[] a, int start, int end){

        while (start < end){

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateArray(int[] a, int k){
        k = k % a.length;
        if(k < 0){
            k = k + a.length;
        }
        reverseArray(a, 0, a.length-1); // 7,6,5,4,3,2,1
        reverseArray(a,  0, k -1);//5,6,7,4,3,2,1
        reverseArray(a, k, a.length-1); //5,6,7,1,2,3,4
    }

    /*
    Print the n-th Fibonacci number
     */
    public static int fibonacci(int n){

        if(n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    /*
    Check whether string is a Isogram or not
     */
    public static boolean   isIsogram(String s){

        System.out.println("********** Printing Isogram or not *********");
        boolean isIsogram = true;
        char[] ch = s.toCharArray();
        Set<Character> chSet = new HashSet<>();
        for(Character c :ch){
            if(chSet.contains(c))
                isIsogram = false;
            else
                chSet.add(c);
        }
        return isIsogram;

    }

}
