package com.safatech.thread;
// interrupted and interrupt method
public class TestInterruptingThread4 extends Thread{

    public void run(){
        for(int i = 1; i<=5; i++){
            if(Thread.interrupted()){
                System.out.println("Code for Interrupted Thread...");
            }else {
                System.out.println("Code for Normal Thread...");
            }
        }
    }

    public static void main(String[] args) {
        TestInterruptingThread4 t1 = new TestInterruptingThread4();
        TestInterruptingThread4 t2 = new TestInterruptingThread4();
        t1.start();
        t1.interrupt();
        t2.start();
    }
}
