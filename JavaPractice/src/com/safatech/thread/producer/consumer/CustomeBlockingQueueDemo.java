package JavaPractice.src.com.safatech.thread.producer.consumer;

public class CustomeBlockingQueueDemo {


    static void main() {

        CustomeBlockingQueue<Integer> queue = new CustomeBlockingQueue<>(3);

        // Producer thread
        Thread producer = new Thread(()->{

            for(int i = 1; i <= 5; i++){
               try{
                   System.out.println("producing : " + i);
                   queue.put(i);
                   Thread.sleep(1000);
               }catch (InterruptedException e){

                   Thread.currentThread().interrupt();
               }
            }
        });

        // consumer thread
        Thread consumer = new Thread(()->{

            for(int i = 1; i <= 5; i++){
                try{
                    int value = queue.take();
                    System.out.println("consumed : " + i);
                    Thread.sleep(1000);

                }catch (InterruptedException e){

                    Thread.currentThread().interrupt();
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
