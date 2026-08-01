package JavaPractice.src.com.safatech.collection;

import java.util.*;

public class QueueExample {

    static void main() {

        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(8);
        minHeap.add(2);
        minHeap.add(5);
        minHeap.add(1);

        minHeap.forEach(e -> IO.println(e));
        while (!minHeap.isEmpty()){

            IO.println("Remove from front: " + minHeap.poll());
        }

        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(5);
        maxHeap.add(8);

        maxHeap.forEach(e -> IO.println(e));
        while (!maxHeap.isEmpty()){

            IO.println("Remove from the front: " + maxHeap.poll());
        }

        Deque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(2);
        arrayDequeAsQueue.addLast(4);
        arrayDequeAsQueue.addLast(8);
        arrayDequeAsQueue.addLast(9);

        // Deletion
        // FIFO
        int element = arrayDequeAsQueue.removeFirst();
        IO.println(element);

        // LIFO
        Deque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(4);
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(1);

        int el = arrayDequeAsStack.removeFirst();
        IO.println(el);






    }

}
