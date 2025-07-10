package JavaPractice.src.com.safatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * How to use map to convert object String into Uppercase in Java 8?
 */
public class ConvertToUpperCase {

    public static void getUppercaseString(String[] names){

        List<String> nameList = Arrays.stream(names)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(nameList);
    }
    public static void main(String[] args) {

        String[] names = {"saddam", "khan", "farheen", "Safa naaz"};
        getUppercaseString(names);
    }
}
