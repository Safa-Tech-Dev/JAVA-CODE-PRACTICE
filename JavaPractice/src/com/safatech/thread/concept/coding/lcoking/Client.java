package JavaPractice.src.com.safatech.thread.concept.coding.lcoking;

public class Client {

    static void main() {

        // Reentrant Lock
//        ReentrantLockSharedResource reentrantLockSharedResource = new ReentrantLockSharedResource();
//
//        Thread reentrantThread1 = new Thread(() -> {
//            reentrantLockSharedResource.producer();
//        });
//        Thread reentrantThread2 = new Thread(() -> {
//            reentrantLockSharedResource.producer();
//        });

//        reentrantThread1.start();
//        reentrantThread2.start();

        // ReadWrite Lock
//        ReadWriteLockSharedResource readWriteLockSharedResource = new ReadWriteLockSharedResource();
//        ReadWriteLockSharedResource readWriteLockSharedResource1 = new ReadWriteLockSharedResource();
//        Thread readThread1 = new Thread(() ->{
//
//            readWriteLockSharedResource.producer();
//        });
//        Thread readThread2 = new Thread(() ->{
//
//            readWriteLockSharedResource.producer();
//        });
//        Thread writeThread3 = new Thread(() ->{
//
//            readWriteLockSharedResource.consume();
//        });

//        readThread1.start();
//        readThread2.start();
//        writeThread3.start();

        // StampedLock
//        StampedLockVitalMonitor stampedLockVitalMonitor = new StampedLockVitalMonitor();
//
//        Thread readerThread = new Thread(() ->{
//
//            for(int i = 1; i < 5; i++){
//                IO.println("Reader got: " + stampedLockVitalMonitor.getHeartRateFast());
//            }
//        });


//        Thread writerThread = new Thread(() ->{
//
//            for(int i = 1; i < 5; i++){
//                stampedLockVitalMonitor.updateHeartRate(i);
//                IO.println("Writer set: " + i);
//            }
//        });
//        readerThread.start();
//        writerThread.start();


        // Semaphore

//        SemaphoreICUMonitoringSystem icu = new SemaphoreICUMonitoringSystem();

        // 6 patients, but only 3 monitored at once
//        for(int i = 0; i < 6; i++){
//
//            final String p = "patient_" + i;
////            new Thread(() -> icu.connectPatientMonitor(p)).start();
//        }

        LockFreeSharedResource lockFreeSharedResource = new LockFreeSharedResource();

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 300; i++){

                lockFreeSharedResource.increment();
            }
        });

        Thread t2 = new Thread(() -> {

            for(int i = 0; i < 200; i++){

                lockFreeSharedResource.increment();
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        IO.println(lockFreeSharedResource.get());
    }

}
