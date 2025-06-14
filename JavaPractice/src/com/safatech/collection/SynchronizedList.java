package JavaPractice.src.com.safatech.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// How can you synchronize an ArrayList in Java?
public class SynchronizedList {

    public static void main(String[] args) {


        //method - 1 (Using Collections.synchronizedList() method)
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        synchronizedList.add("Learn");
        synchronizedList.add("Code");
        synchronizedList.add("Practice");

        synchronized (synchronizedList){  // Must be declared

            Iterator it = synchronizedList.iterator();
            while (it.hasNext()){

                System.out.println(it.next());
//                synchronizedList.add("Interview");  // Throw error
            }
        }
        System.out.println();
        //method - 2 (Using CopyOnWriteArrayList)
        //Creating a thread-safe ArrayList
        CopyOnWriteArrayList<String> sync_list = new CopyOnWriteArrayList<>();
        sync_list.add("Learn");
        sync_list.add("Code");
        sync_list.add("Practice");

        Iterator it = sync_list.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
            sync_list.add("Interview");
        }


    }
}
