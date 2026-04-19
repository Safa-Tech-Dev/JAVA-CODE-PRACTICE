package JavaPractice.src.com.safatech.thread.concept.coding.lcoking;

import java.util.concurrent.locks.StampedLock;

public class StampedLockVitalMonitor {


    private double heartRate = 0.72;
    private final StampedLock stampedLock = new StampedLock();


    // Optismistic read - no lock acquired
    public double getHeartRateFast(){

        long stamp = stampedLock.tryOptimisticRead(); // get a stamp version
        double rate = heartRate; // read the data

        // Was the data changed by a writer while we read?
        if(!stampedLock.validate(stamp)){
            // Yes — fall back to a real read lock
            stamp = stampedLock.readLock();
            try {
                rate = heartRate;
                Thread.sleep(2000);
            }catch (Exception e){

            }finally {
                stampedLock.unlockRead(stamp);
            }
        }
        return rate; // always a consistent value

    }

    public void updateHeartRate(double newRate){

        long stamp = stampedLock.writeLock();

        try {
            heartRate = newRate;
            Thread.sleep(2000);
        }catch (Exception e){

        }
        finally {
            stampedLock.unlockWrite(stamp);
        }
    }
}
