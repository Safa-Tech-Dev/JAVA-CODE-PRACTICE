package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithDuplicateCharacter {

    static void main() {

        List<String> words = Arrays.asList("you", "exe", "ooo", "xyz", "zzz");

        List<String> collect = words.stream()
                .filter(s -> s
                        .chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.toSet())
                        .size() == 1)
                .collect(Collectors.toList());
        IO.println(collect);
    }
}
