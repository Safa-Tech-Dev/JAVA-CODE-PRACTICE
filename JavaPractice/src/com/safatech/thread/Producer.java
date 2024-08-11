package com.safatech.thread;

public class Producer extends Thread{

    Company c;
    Producer(Company c){
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
