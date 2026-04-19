package JavaPractice.src.com.safatech.thread.concept.coding.lcoking;

import java.util.concurrent.atomic.AtomicInteger;

public class LockFreeSharedResource {

    AtomicInteger atomicInteger = new AtomicInteger(0);
    public void increment(){

        atomicInteger.incrementAndGet();
    }

    public int get(){

        return atomicInteger.get();
    }
}
