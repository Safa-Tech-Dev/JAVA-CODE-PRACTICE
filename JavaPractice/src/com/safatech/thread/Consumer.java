package JavaPractice.src.com.safatech.thread;

public class Consumer extends Thread{

    com.safatech.thread.Company c;
    public Consumer(com.safatech.thread.Company c){
        this.c = c;
    }
    public void run(){
        while (true){
            try {
                this.c.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
