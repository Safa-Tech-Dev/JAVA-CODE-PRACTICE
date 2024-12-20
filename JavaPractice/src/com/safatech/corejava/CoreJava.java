package com.safatech.corejava;

import java.util.*;
public class CoreJava{

    public static void main(String[] args) {

        /*
        3.Finding the nth element in the Fibonacci series
         */ 
        System.out.println("******* Finding the n-th element in the Fibonacci series ****");
        System.out.println(CoreJava.fibonacci(10));

        /*
        Remove the duplicates character from the string and print the string
        */

        System.out.println(CoreJava.removeDuplicateCharacter("saddam"));

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

        /*
        14.Write a program to reverse the array1d without using the new array1d
         */
        int[] arr2 = {1,2,3,4,5,6};
        int temp;
        for(int i = 0; i<arr2.length/2; i++){

            temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp;
        }
        System.out.println("*********** Printing reverse the array1d without using the new array1d ***********");
        for(int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i] + "");
        }

        /*
        15.Reverse the word in string
         */

        System.out.println(" ***************** Printing he reversed string **************");
        String s = "How are you";
        String[] strArray = s.split(" ");
        String reversedWord = "";

        for(int i = strArray.length -1; i>=0; i--){

            reversedWord = reversedWord + strArray[i] +" ";

        }
        System.out.println(reversedWord);

        /*
        16.checkAnagram
         */
        String s1 = "salesmen"; // saleman, danger
        String s2 = "nameless";// nameless, garden
        System.out.println(CoreJava.checkAnagram(s1,s2));

       /* 31.Write a program to find the sum of all the digits of a number
         */
        System.out.println("****** Printing sum of all the digits ******8");
        int num1 = 12345;//15

        System.out.println(CoreJava.findSumOfAllDigit(num1));

        System.out.println("****************** Printing Kth largest Element *********************");
        int[] arr1 = {4,2,9,7,5,6,7,1,3};
        int k1 = 4;
        System.out.println(CoreJava.findKthLargestElement(arr1,k1));

        /*
        Check the String is Palindrome or not
        1.reverse the string and check with the original string
        2. if contains equal , palindrom otherwise not palindrom
         */

        String originalString2 = "Mom"; // java
        CoreJava.checkPalindrom(originalString2);

        /*
        Program to remove/ delete the element from the array1d
         */
        int[] originalArray = {1,2,3,4,5};
        int elementToRemove = 3;
        System.out.println("**** Printing the Removed Array ************");
        System.out.println("Original Array " + Arrays.toString(originalArray));
        System.out.println("Element removed: " + Arrays.toString(CoreJava.remove(originalArray,elementToRemove)));

        /*
        Write a program to print the even length string
        e.g Hell world we lol
        o/p - hell , we
         */
        String givenString = " Hell World We lol";
        CoreJava.getEvenString(givenString);
    }

    public static void getEvenString(String givenString) {

        System.out.println("******** Printing Even Length String ********");
        for(String s : givenString.split(" ")){
            if(s.length() % 2 == 0){
                System.out.println(s);
            }
        }
    }

    public static int[] remove(int[] array, int elementToRemove) {

        int[] newArray = new int[array.length-1];
        int index = 0;
        for(int i = 0; i< array.length; i++){
            if(array[i] != elementToRemove){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }

    public static void checkPalindrom(String originalString2) {

        System.out.println(" ***** Printing Palindrom or not *************");
        String reversedString = "";
        for(int i = originalString2.length() - 1; i>= 0 ; i--){
            reversedString = reversedString + originalString2.charAt(i);

        }
        if(originalString2.equalsIgnoreCase(reversedString)){
            System.out.println("Palindrom...");
        }else{
            System.out.println("Not Palindrom...");
        }
    }

    public static int findKthLargestElement(int[] arr, int k){

        Arrays.sort(arr); // {4,2,9,7,5,6,7,1,3} => sorted => 1,2,3,4,5,6,7,7,9

        return arr[arr.length - k]; // arr[9- 4 ] => arr[5] => 6
    }

    private static int findSumOfAllDigit(int num1) {

        int sum = 0;
        int rem;
        while(num1 > 0){

            rem = num1 % 10;
            sum += rem;
            num1 = num1 / 10;
        }
        return sum;
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
    /*
    Remove the duplicates character from the string and print the string
     */
    public static String removeDuplicateCharacter(String str){
        System.out.println("************ Printing removed duplicates string ***************");
        Set<Character> characterSet = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if(!characterSet.contains(ch)){
                characterSet.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
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
     // Check Anagram
    public static boolean checkAnagram(String s1, String s2){

        System.out.println("**************** Checking Anagram **************");
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        if(s1.length() != s2.length())
            return false;
        Arrays.sort(a1);
        Arrays.sort(a2);
        return a1.equals(a2);
    }

}
