package safatech.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {
        Integer[] arr = {1,1,3,6,0,7,-8,-1,-3};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> l = list.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());
        System.out.println(l);
    }
}
