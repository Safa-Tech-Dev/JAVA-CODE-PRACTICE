package JavaPractice.src.com.safatech.dsa.datastructure.priorityqueue.pattern;

import java.util.*;

class Task{

    String name;
    int priority; // 1 high , 5 = low

    Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }
}
public class AboutQueue {

    public static void main(String[] args) {
        
        // min Heap - Default, Natural ordering root has the min element
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(3);
        System.out.println(minHeap.poll()); // lowest has the highest priority = 1
        
        
        // max Heap - Custom, pass the comparator, root has the max element
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(3);
        System.out.println(maxHeap.poll()); // highest has the high priority = 5


        // Ascending order
        Queue<Task> tasks = new PriorityQueue<>((a, b) -> a.priority - b.priority);

        tasks.add(new Task("Backup", 3));
        tasks.add(new Task("Urgent", 1));
        tasks.add(new Task("Refactor", 5));

        System.out.println(tasks.poll().name); // Urgent

        // Converting to sorted list
        List<Integer> listSorted = new ArrayList<>();
        while (!minHeap.isEmpty()){

            listSorted.add(minHeap.poll());
        }
        System.out.println(listSorted); // [1,3,5]

    }
}
