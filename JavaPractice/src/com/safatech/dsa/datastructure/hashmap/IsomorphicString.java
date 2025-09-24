package com.safatech.dsa.datastructure.hashmap;

import java.util.*;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 *
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 *
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 *
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 */
public class IsomorphicString {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
        s = "foo";
        t = "bar";
        System.out.println(isIsomorphic(s,t));
        s = "paper";
        t = "title";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {

        // Two strings cannot be isomorphic if they have different lengths.
        if(s.length() != t.length())
            return false;
        // Use Java's built in map to store mappings of s chars to t chars.
        Map<Character, Character> map = new HashMap<>();
        // Use a set to keep track of already mapped characters.
        Set<Character> set = new HashSet<>();

        for(int i= 0; i<s.length(); i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            // If c1 has been encountered before
            if(map.containsKey(c1)){

                // Return false if first occurrence of c1 is mapped to a different character.
                if(map.get(c1) != c2)
                    return false;
            }
            // If c1 is encountered for the first time, it has not been mapped yet:
            else{
                // Return false if c2 is already mapped to some other char in s
                if(set.contains(c2))
                    return false;
                // All checks passed. So insert in the map, and the set.
                map.put(c1,c2);
                set.add(c2);
            }
        }
        return true;
    }
}
