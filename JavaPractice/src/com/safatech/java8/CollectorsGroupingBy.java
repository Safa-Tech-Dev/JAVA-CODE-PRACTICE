package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {

    /**
     * Count the City Frequency
     * O/P : {Chennai=2, kochi=1, Pune=3, Trivandrum=2, Bangalore=1}
     * @param listOfCity
     */
    public static void getCityFrequencyCount(List<String> listOfCity){

        Map<String, Long> collected = listOfCity.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collected);
    }

    /**
     * How to count each element/word from the String ArrayList in Java8?
     * @param word
     */
    public static void countEachWord(List<String> word){

        Map<String, Long> countedWord = word.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countedWord);
    }

    /**
     * How to count each word from the String
     * @param s
     */
    public static void getFrequencyInString(String s){

        String[] splitedString = s.split(" ");
        Map<String, Long> frequencyMap = Arrays.stream(splitedString)
                .map(e -> e.replace(",", ""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
    }
    public static void main(String[] args) {

        //Count the City Frequency
        List<String> listOfCity = Arrays.asList("kochi", "Trivandrum", "Chennai",
                "Chennai", "Trivandrum", "Pune", "Pune", "Pune", "Bangalore");
        getCityFrequencyCount(listOfCity);

        //How to count each element/word from the String ArrayList in Java8?
        List<String> names = Arrays.asList("AA","BB", "CC","AA");
        countEachWord(names);

        // count freuency in string
        String str = "hi, how are you, how are you";
        getFrequencyInString(str);

    }
}
