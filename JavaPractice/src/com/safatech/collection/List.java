package JavaPractice.src.com.safatech.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
Write a program in java to join two arraylists into one
arraylist.
*/
public class List {

    public static void main(String[] args) {

        java.util.List<String> l1 = new ArrayList<>();
        l1.add("Saturday");
        l1.add("Sunday");
        l1.add("Monday");
        l1.add("Tuesday");

        java.util.List<String> l2 = new ArrayList<>();
        l2.add("Wednesday");
        l2.add("Thursday");
        l2.add("Friday");

        java.util.List<String> joined_list = new ArrayList<>();
        l1.addAll(l2);
        System.out.println(l1);
        joined_list.addAll(l1);
        joined_list.addAll(l2);
//        System.out.println(joined_list);

        // have to give the index in listIterator, from where it has to start
        ListIterator<String> iterator = joined_list.listIterator(joined_list.size());
        while (iterator.hasPrevious()){

            String previous = iterator.previous();
            IO.println("Traversing in backward direction: " + previous + " Next Index: " + iterator.nextIndex() + " Previous Index: " + iterator.previousIndex());


        }

        // using deque functionality
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addFirst(100);
        IO.println(list.getFirst());

        // using list functionality
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(0, 100);
        list1.add(1, 300);
        list1.add(2, 400);
        list1.add(1, 200);

        IO.println(list1.get(1) + " : " + list1.get(2));

    }
}
