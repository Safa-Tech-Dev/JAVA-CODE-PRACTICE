package JavaPractice.src.com.safatech.thread;

public class EvenOddThread {

    int number = 1;

    public synchronized void oddThread() throws InterruptedException {

        while (number <= 10){

            while (number % 2 == 0){

                wait();
            }
            IO.println("Odd: " + number++);
            notifyAll();
            Thread.sleep(2000);
        }
    }

    public synchronized void evenThread() throws InterruptedException {

        while (number <= 10){

            while (number % 2 != 0){
                wait();
            }
            IO.println("Even: " + number++);
            notifyAll();
            Thread.sleep(2000);
        }
    }

    static void main() {

        EvenOddThread evenOddThread = new EvenOddThread();
        Thread t1 = new Thread(() -> {

            try{

                evenOddThread.oddThread();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {

            try {
                evenOddThread.evenThread();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}

