package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCityFrequency {

    public static void getCityFrequencyCount(List<String> listOfCity){

        Map<String, Long> collected = listOfCity.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collected);
    }
    public static void main(String[] args) {
        List<String> listOfCity = Arrays.asList("kochi", "Trivandrum", "Chennai",
                "Chennai", "Trivandrum", "Pune", "Pune", "Pune", "Bangalore");
        getCityFrequencyCount(listOfCity);

    }
}
