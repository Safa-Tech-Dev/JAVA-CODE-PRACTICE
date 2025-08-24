package JavaPractice.src.com.safatech.java8;

import JavaPractice.src.com.safatech.java8.model.EmployeeDO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamHiddenFeatures {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("saddam", null, "Farheen", "Safa", null, "Umr");

        //traditional approach
        List<String> nameList = names.stream()
                .filter(name -> name != null)
                .collect(Collectors.toList());
        System.out.println(nameList);

        // 1. Stream.ofNullable();(discard the null value and filter it)
        List<String> ofNullableName = names.stream()
                .flatMap(Stream::ofNullable)
                .collect(Collectors.toList());
        System.out.println(ofNullableName);

        //2. Stream.iterate(); to gnerate infinite sequnce of numbers with the seed value
        Stream.iterate(1, n -> n + 2) // try to change the value of seec(1) and see
                .limit(5)
                .forEach(System.out::println);

        //3. Collectors.collectingAndThen
        List<EmployeeDO> employees = Arrays.asList(
                new EmployeeDO(1, "saddam",700000),
                new EmployeeDO(2, "saddam",600000),
                new EmployeeDO(3, "Safa",560000)
        );
        Long avgSalary = employees.stream()
                .mapToDouble(EmployeeDO::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.averagingDouble(Double::doubleValue), // first collector
                        Math::round));
        System.out.println(avgSalary);

        //4. Stream.takewhile() & Stream.dropWhile()
        List<Integer> numbers = List.of(1,2,3,4,6,7,8,9);

        List<Integer> takeWhile = numbers.stream()
                .takeWhile(n -> n < 5)
                .collect(Collectors.toList());
        System.out.println(takeWhile);

        List<Integer> dropWhile = numbers.stream()
                .dropWhile(n -> n < 5)
                .collect(Collectors.toList());
        System.out.println(dropWhile);

        List<Integer> takeDropWhile = numbers.stream()
                .dropWhile(n -> n < 3)
                .takeWhile(n -> n < 7)
                .collect(Collectors.toList());
        System.out.println(takeDropWhile);

        //5. Collectors.teeing()[combine two collectors]
        //1-> min
        //2 -> max
        //map
        Map<String, Integer> minMaxMap = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.minBy(Integer::compareTo), // 1st collector
                        Collectors.maxBy(Integer::compareTo), // 2nd collector
                        (e1, e2) -> Map.of("min", e1.get(), "max", e2.get()
                        )));
        System.out.println(minMaxMap);

        //6. Stream.concat()
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> integerStream2 = Stream.of(6, 7, 8, 9);
        Stream<Integer> concatStream = Stream.concat(integerStream1, integerStream2);

        int summed = concatStream.mapToInt(Integer::intValue).sum();
        System.out.println(summed);

        //7. Collectors.partitioningBy()
        Map<Boolean, List<Integer>> booleanListMap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even: " + booleanListMap.get(Boolean.TRUE));
        System.out.println("Odd: " + booleanListMap.get(Boolean.FALSE));

        //8. IntStream.range/rangeClosed
        List<Integer> collectRange = IntStream.range(1, 20)
                .boxed()
                .collect(Collectors.toList());//20 exclusive
        List<Integer> collectRangeClosed = IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.toList());//20 inclusive
        System.out.println(collectRange);
        System.out.println(collectRangeClosed);


    }
}
