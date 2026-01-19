package JavaPractice.src.com.safatech.dsa.datastructure.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    static Map<Character, Integer> makeFrequencyMap(String s){

        Map<Character, Integer> freq = new HashMap<>();

        for(Character c : s.toCharArray()){

            freq.put(c, freq.getOrDefault(c, 0) + 1);

        }
        return freq;
    }

    // Taking more space as we are using two Map
    static boolean isAnagram(String s, String t){

        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map1 = makeFrequencyMap(s);
        Map<Character, Integer> map2 = makeFrequencyMap(t);
        return map1.equals(map2);
    }
    // Space Optimized
    static boolean isAnagram1(String s, String t){

        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map = makeFrequencyMap(s);

        for(Character c : t.toCharArray()){

            if(!map.containsKey(c))
                return false;

            Integer currFreq = map.get(c);
            map.put(c, currFreq - 1);
        }
        // All valuse in map should be zero for s and t to be anagrams
        for(Integer i : map.values()){
            if(i != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram1(s1,t1)); // true
        System.out.println(isAnagram1(s2,t2)); // false


    }
}
