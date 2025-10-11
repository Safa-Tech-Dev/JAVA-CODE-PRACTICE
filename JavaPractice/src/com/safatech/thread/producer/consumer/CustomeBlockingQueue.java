package JavaPractice.src.com.safatech.thread.producer.consumer;

import java.util.LinkedList;
import java.util.Queue;

public class CustomeBlockingQueue<T> {

    private final Queue<T> queue = new LinkedList<>();
    private final int capacity;

    public CustomeBlockingQueue(int capacity){
        this.capacity = capacity;
    }

    // Producer: Add elements to queue (wait if full)
    public synchronized void put(T item) throws InterruptedException {

        while(queue.size() == capacity){

            wait(1000); // wait for space
        }
        queue.add(item);
        notifyAll(); // notify waiting consumers
    }

    // Consumer:  Remove element from queue (wait if empty)
    public synchronized T take() throws InterruptedException {

        while(queue.isEmpty()){

            wait(1000);
        }
        T item = queue.remove();
        notifyAll();
        return item;
    }

}
