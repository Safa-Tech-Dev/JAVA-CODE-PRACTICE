package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateCharacterWord {

    static void main() {

        String[] str = {"abc def aab", "banana", "abc", "abc", "krishna ram"};

        Arrays.stream(str)
                .filter(s -> s.replaceAll("\\s+", "")
                        .chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                        .values()
                        .stream()
                        .anyMatch(n -> n > 1))
                .forEach(IO::println);
    }
}
