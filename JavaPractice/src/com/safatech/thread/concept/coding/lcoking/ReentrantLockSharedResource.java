package JavaPractice.src.com.safatech.thread.concept.coding.lcoking;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockSharedResource {

    boolean isAvaialble = false;

    ReentrantLock lock = new ReentrantLock();

    public void producer(){

        try{

            lock.lock();
            IO.println("Lock acquired by " + Thread.currentThread().getName());
            isAvaialble = true;
            Thread.sleep(4000);
        }catch (Exception e){

        }finally {

            lock.unlock();
            IO.println("Lock released by " + Thread.currentThread().getName());
        }
    }
}
