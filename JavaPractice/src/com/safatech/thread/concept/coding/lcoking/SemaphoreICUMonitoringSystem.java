package JavaPractice.src.com.safatech.thread.concept.coding.lcoking;

import java.util.concurrent.Semaphore;

public class SemaphoreICUMonitoringSystem {


    // Only 3 monitoring connections allowed simultaneously
    private final Semaphore semaphore = new Semaphore(3);

    public void connectPatientMonitor(String patientId){

        try{
            semaphore.acquire(); // take a "ticket" — blocks if 0 available
            IO.println("Connected " + patientId + " | slots available " + semaphore.availablePermits());
            Thread.sleep(8000); // simulate active monitoring
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            semaphore.release(); // return the ticket — others can enter
            IO.println("Disconnected: " + patientId);
        }
    }

}
