package com.safatech.thread;
//Example of interrupting the thread that behaves normally
public class TestInterruptingThread3 extends Thread{

    public void run(){
        for(int i = 0; i<= 5; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        TestInterruptingThread3 t1 = new TestInterruptingThread3();
        t1.start();
        t1.interrupt();
    }

}
