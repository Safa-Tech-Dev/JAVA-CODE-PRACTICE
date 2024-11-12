package com.safatech.dsa.datastructure.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array1d of strings strs, group the anagrams together. You can return the answer in any order.
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Explanation:
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] str1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(getAnagramList(str1));
        String[] str2 = {""};
        System.out.println(getAnagramList(str2));
        String[] str3 = {"a"};
        System.out.println(getAnagramList(str3));

    }
    public static List<List<String>> getAnagramList(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedStr = new String(letters);
            if (!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            List<String> anaList = map.get(sortedStr);
            anaList.add(word);
        }
        return new ArrayList<>(map.values());
    }
}
