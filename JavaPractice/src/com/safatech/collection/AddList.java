package JavaPractice.src.com.safatech.collection;

import java.util.ArrayList;
import java.util.List;

/**
Write a program in java to join two arraylists into one
arraylist.
*/
public class AddList {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("Saturday");
        l1.add("Sunday");
        l1.add("Monday");
        l1.add("Tuesday");

        List<String> l2 = new ArrayList<>();
        l2.add("Wednesday");
        l2.add("Thursday");
        l2.add("Friday");

        List<String> joined_list = new ArrayList<>();
        l1.addAll(l2);
        System.out.println(l1);
//        joined_list.addAll(l1);
//        joined_list.addAll(l2);
//        System.out.println(joined_list);

    }
}
