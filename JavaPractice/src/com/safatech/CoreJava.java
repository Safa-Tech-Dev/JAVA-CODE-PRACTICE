package com.safatech;

import java.util.*;

public class CoreJava{

    public static void main(String[] args) {

        /*
         1.Rotate the array by k times;
         int[] nums = {1,2,3,4,5,6,7};
         k = 3;
         Output: [5,6,7,1,2,3,4]
         */
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("************* Printing the Rotated Array **************");
        CoreJava.rotateArray(arr,k);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


        /*
        2.Printing Isogram or not(Which does not contain any duplicate characters)
         */
        System.out.println();
        System.out.println(CoreJava.isIsogram("codedecode"));

        /*
        3.Finding the nth element in the Fibonacci series
         */
        System.out.println("******* Finding the n-th element in the Fibonacci series ****");
        System.out.println(CoreJava.fibonacci(10));

        /*
        4.Find the duplicate Character in a String
         */
        System.out.println(CoreJava.findDuplicateUsingFor_Map("codedecode"));

        /*
         5.Find the first non-repeating charater's index
         */
        System.out.println(CoreJava.nonRepeatingCharacter("ccdec"));
        /*
         6.Given an array of integers, return the indices of the two numbers
         whose sum is equal to a given target.
         You may assume that each input would have exactly one solution,
          and you may not use the same element twice.
          Given nums = [2, 7, 11, 15], target = 9
          The output should be [0, 1].
          Because nums[0] + nums[1] = 2 + 7 = 9
         */
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(CoreJava.twoSum(nums, target)));

         /*
        7.Count even and odd digits in a int nums = 123456;
         */
        System.out.println(" ********** Printing Count of even and odd digits *********");
        int num = 123456;
        CoreJava.countEvenOdd(num);
         /*
         8.String.join method
        */
        System.out.println("***** Printing String.join method ******");

        List<String> nos = Arrays.asList("1","2","3","4");
        String results = String.join("-", nos);
        System.out.println(results);
        /*
         9.method to Check For Rotation of String
        */
        String originalString = "decode";
        String toBeChecked = "codede";
        System.out.println("*********Printing method to Check For Rotation of String ***********");
        System.out.println(CoreJava.checkForRotation(originalString,toBeChecked));

        /*
        10.Write a program to reverse a string without using inbuilt reverse() method
         */
        System.out.println(" ************** program to reverse a string without using inbuilt reverse() method *********");
        String name = "Safa Tech";
        StringBuilder b = new StringBuilder(name);

        System.out.println("Using in-built reverse(): " + b.reverse());
        String reversedString = "";
        for(int i = name.length() - 1; i>= 0; i--){

            reversedString = reversedString + name.charAt(i);
        }
        System.out.println(reversedString);
        /*
        11.Left Rotation of String
         */
        System.out.println("************ Printing Left Rotation of String ************");
        System.out.println(CoreJava.leftRotation("decode",2));
        /*
        12.Right Rotation of String
         */
        System.out.println("************ Printing Right Rotation of String ************");
        System.out.println(CoreJava.rightRotation("decode",2));

        /*
        13.Write a program to remove all space from string
         */
        System.out.println(" ************Printing removed spaces from string ***********");
        String input = "Onespace twospace threespace fourspace";
        String removedspaces = input.replaceAll("\\s+", "");
        System.out.println(removedspaces);
    }
    public static String leftRotation(String originalString, int rotationFactor){
        /* decode
        r = 2
        sub(r)  + sub(0,r)
        code   + de = codede
         */
        String rotatedString = originalString.substring(rotationFactor) + originalString.substring(0,rotationFactor);
        return rotatedString;
    }
    public static String rightRotation(String originalString, int rotationFactor){

        /* decode
        partition(p) = length of string(l) - rotationFactor(r) = 6 - 2 = 4
        sub(p) + sub(0,p)
        de + deco = dedeco
         */
        int partition = originalString.length() - rotationFactor;
        String rotatedString = originalString.substring(partition) + originalString.substring(0,partition);
        return rotatedString;
    }
    public static void countEvenOdd(int nums){

        int even_count = 0;
        int odd_count = 0;
        while(nums > 0){

            int rem = nums % 10;
            if(rem % 2 == 0){
                even_count++;
            }else{
                odd_count++;
            }
            nums = nums / 10;
        }
        System.out.println("Even count :" + even_count  + "," + "Odd count : " + odd_count);
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
        k = k % a.length; // 8 % 7 = 1 rotate
        if(k < 0){
            k = k + a.length; //-3 + 7 = 4 rotate
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
    /*
     method to Check For Rotation of String
     */
    public static boolean checkForRotation(String originalString, String toBeChecked){

        String concatenatedString = originalString + originalString;
        return concatenatedString.contains(toBeChecked);
        /*
        if(concatenatedString.contains(toBeChecked))
            return true;
         else
            return false;
         */
    }

}
