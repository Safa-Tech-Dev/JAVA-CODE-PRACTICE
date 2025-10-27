package JavaPractice.src.com.safatech.java8;

import JavaPractice.src.com.safatech.java8.dao.EmployeeDao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);

       /* int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);*/

        int sum = numbers.stream()
                // convert Stream<Integer> to IntStream (Object to primitive)
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);

        Integer reduceSum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMR = numbers.stream()
                .reduce(Integer::sum);
        System.out.println(reduceSumWithMR.get());

        Integer reduceMultiply = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduceMultiply);

        Integer reduceMaxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(reduceMaxValue);

        Integer maxValueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValueWithMethodReference);

        String[] strArray = {"Java", "Springboot", "microservices","DockerHubKubernetes","Amazon Web Services"};
        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);
    }
}
