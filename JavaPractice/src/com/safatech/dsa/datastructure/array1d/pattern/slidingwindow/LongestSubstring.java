package JavaPractice.src.com.safatech.dsa.datastructure.array1d.pattern.slidingwindow;

import java.util.HashSet;
import java.util.Set;

// Dynamic size - Window
public class LongestSubstring {

    // Naive / Brute - Force  approach

    public static int getLengthOfLongestSubString(String s){

        int n = s.length();
        int maxLength = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                if(isUnique(s, i, j)){
                    maxLength = Math.max(maxLength, j - i  + 1);
                }
            }
        }
        return maxLength;
    }

    private static boolean isUnique(String s, int start, int end) {

        // Use HashSet to keep track of the character in current Sub-String
        Set<Character> chars = new HashSet<>();

        for (int k = start; k <= end; k++){

            if(chars.contains(s.charAt(k))){
                return false;
            }
            chars.add(s.charAt(k));
        }
        return true;
    }

    // Optimal approach

    public static int getLengthOfLongestSubString_2(String s){

        int n = s.length();
        int maxLength = 0;
        int left = 0;

        Set<Character> seen = new HashSet<>();

        // Expand the window by moving right
        for(int right = 0; right < n; right++){

            // If duplicate found, shrink the window from left
            while (seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            // add current character to the window and update the maxLength
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        System.out.println(getLengthOfLongestSubString(s1));
        System.out.println(getLengthOfLongestSubString(s2));
        System.out.println(getLengthOfLongestSubString_2(s1));
        System.out.println(getLengthOfLongestSubString_2(s2));
    }
}
