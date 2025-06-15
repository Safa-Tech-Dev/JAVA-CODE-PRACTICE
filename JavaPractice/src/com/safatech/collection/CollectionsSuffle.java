package JavaPractice.src.com.safatech.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSuffle {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");

        System.out.println("Original List: " + l);
        Collections.shuffle(l);
        System.out.println("After Shuffled: " + l);
    }
}
