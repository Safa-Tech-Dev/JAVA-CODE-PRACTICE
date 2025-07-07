package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonAndRepeatedElement {

    public static void getFirstNonRepeatedJava_8(String str){

        String firstNonRepeated = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(firstNonRepeated);
    }

    public static Character getFirstNonRepeated(String str){

//        LinkedHashMap keeps the insertion order - useful to return the fisr non - repeating char
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        String s = str.toLowerCase();

        // Step 1. Count the characters Frequency
        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        // Find the first character with frequency 1
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){

            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }

     /*
     Find First Repeated Element from the String
     */
    public static void getFirstRepeated(String str){

        String firstRpeated = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .findFirst().get().getKey();
        System.out.println(firstRpeated);
    }
    public static void main(String[] args) {
        String str = "ILoveDawateIslami";
        System.out.println("first Non Repeated ");
        getFirstNonRepeatedJava_8(str);
        System.out.println(getFirstNonRepeated(str));
        System.out.println("first Repeated: ");
        getFirstRepeated(str);
    }
}
