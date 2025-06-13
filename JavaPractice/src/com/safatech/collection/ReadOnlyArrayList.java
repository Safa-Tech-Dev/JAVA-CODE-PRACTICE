package JavaPractice.src.com.safatech.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//How can you make an ArrayList read-only
public class ReadOnlyArrayList {


    public static void main(String[] args) {

        try {

            List<String> list = new ArrayList<>();

            list.add("Learn");
            list.add("Code");
            list.add("Practice");

            System.out.println("Original List: " + list);
            //unmodifiableList
            List<String> unmodifiableList = Collections.unmodifiableList(list);
            unmodifiableList.add("Repeat");
            System.out.println(list);
        } catch (UnsupportedOperationException e) {
            System.out.println("It is a ready only list, can't be modified : " + e);
        }
    }
}
