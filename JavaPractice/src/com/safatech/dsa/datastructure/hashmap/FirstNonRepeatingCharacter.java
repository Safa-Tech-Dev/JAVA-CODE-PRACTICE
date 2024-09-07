package com.safatech.dsa.datastructure.hashmap;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
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
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("leetcode"));
        System.out.println(firstUniqueCharacter("loveleetcode"));
        System.out.println(firstUniqueCharacter("aabb"));
    }

    public static int firstUniqueCharacter(String s){

        Map<Character, Integer> map = new LinkedHashMap<>();
        //Iterate over each character in the string
        for(int i = 0; i< s.length(); i++){

            char c = s.charAt(i);
            //check the character exist in the map
            if(map.containsKey(c)){
                //increase the value by 1
                map.put(c, map.get(c)+1);
            }else{
                //add in the map with value 1
                map.put(c,1);
            }

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
}
