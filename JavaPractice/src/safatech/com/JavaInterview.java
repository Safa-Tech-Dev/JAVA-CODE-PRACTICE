package safatech.com;

import java.util.*;

public class JavaInterview {
    public static void main(String[] args) {
        //Output: [5,6,7,1,2,3,4]
       /* int k = 3;

        // rotatedString = sub(p) + sub(0,p)
        int[] nums = {1,2,3,4,5,6,7};
        int[] rotatedArray = new int[nums.length];
        for(int j = nums.length; j< k; j--,k--){

        }*/

        /*
        Printing Isogram or not = Which does not contain any duplicate characters
         */
        System.out.println(JavaInterview.isIsogram("Pen"));

        /*
        Finding the nth element in the Fibonacci series
         */
        System.out.println("******* Finding the nth element in the Fibonacci series ****");
        System.out.println(JavaInterview.fibonacci(10));

    }

    public static int fibonacci(int n){

        if(n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    public static boolean isIsogram(String s){

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
