package com.safatech.string;

import java.util.Arrays;

/**
 * An anagram is a word or phrase formed by rearranging the letters of another word or phrase,
 * using all the original letters exactly once. For example, "listen" is an anagram of "silent".
 */
public class Anagram {

    public static boolean checkAnagram(String s1, String s2){

        char[] strArray1 = s1.toCharArray();
        char[] strArray2 = s2.toCharArray();

        if(strArray1.length != strArray2.length)
            return false;
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);
        return Arrays.equals(strArray1,strArray2);
    }
    public static void main(String[] args) {

        String s1 = "salesmen"; // salesman, danger
        String s2 = "nameless";// nameless, garden
        System.out.println(checkAnagram(s1,s2));

    }
}
