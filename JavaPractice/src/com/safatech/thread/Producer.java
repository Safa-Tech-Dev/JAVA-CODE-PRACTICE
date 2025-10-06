package JavaPractice.src.com.safatech.thread;

public class Producer extends Thread{

    com.safatech.thread.Company c;
    public Producer(com.safatech.thread.Company c){
        this.c = c;
    }
    public void run(){

        int i = 1;
        while(true){
            try {
                this.c.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            i++;
        }
    }
}
