package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Write a Java 8 program to concatenate two Streams?
 */
public class Concat2Streams {

    public static void getConcatenatedStream(List<String> list1, List<String> list2){

        Stream<String> concated = Stream.concat(list1.stream(), list2.stream());
        concated.forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("Saddam", "Farheen");
        List<String> l2 = Arrays.asList("Safa", "Khan");
        getConcatenatedStream(l1, l2);
    }
}
