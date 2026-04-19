package JavaPractice.src.com.safatech.thread.concept.coding.lcoking;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockSharedResource {

    boolean isAvaialble = false;

    ReadWriteLock lock = new ReentrantReadWriteLock();

    public void producer(){

        try{

            lock.readLock().lock();
            IO.println("Read Lock acquired by " + Thread.currentThread().getName());
            isAvaialble = true;
            Thread.sleep(8000);
        }catch (Exception e){

        }finally {

            lock.readLock().unlock();
            IO.println("Read Lock released by " + Thread.currentThread().getName());
        }
    }
    public void consume(){

        try{

            lock.writeLock().lock();
            IO.println("Write Lock acquired by " + Thread.currentThread().getName());
            isAvaialble = true;
//            Thread.sleep(8000);
        }catch (Exception e){

        }finally {

            lock.writeLock().unlock();
            IO.println("Write Lock released by " + Thread.currentThread().getName());
        }
    }
}
