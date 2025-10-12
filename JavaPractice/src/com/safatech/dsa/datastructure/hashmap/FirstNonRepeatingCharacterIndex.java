package JavaPractice.src.com.safatech.dsa.datastructure.hashmap;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  387
 *  First Unique Character in a String
 * Solution
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 *
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstNonRepeatingCharacterIndex {

    public static int firstUniqueCharacterIndex(String s){

        Map<Character, Integer> map = new LinkedHashMap<>();
        //Iterate over each character in the string
        for(int i = 0; i< s.length(); i++){

            char c = s.charAt(i);
            //check the character exist in the map
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(int i = 0; i< s.length(); i++){

            char c = s.charAt(i);
            int val = map.get(c);
            if(val == 1){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println(firstUniqueCharacterIndex("leetcode"));
        System.out.println(firstUniqueCharacterIndex("loveleetcode"));
        System.out.println(firstUniqueCharacterIndex("aabb"));
    }
}
