package JavaPractice.src.com.safatech.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    static void main() {

        List<Integer> values = new ArrayList<>();

        values.add(5);
        values.add(4);
        values.add(3);
        values.add(2);
        values.add(1);

        Iterator<Integer> it = values.iterator();
        while (it.hasNext()){

            int value = it.next();
            if(value == 3){
                it.remove();
            }
        }

        IO.println("For each Method");
        for(int value : values){

            IO.println(value);
        }
        IO.println("Using java 8 forEach");
        values.forEach(val -> IO.println(val));
    }
}
