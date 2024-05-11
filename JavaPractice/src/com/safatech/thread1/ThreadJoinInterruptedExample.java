package com.safatech.thread1;
class InterruptedExceptionExample extends Thread{
    Thread threadToInterrupt;

    public void run(){

        threadToInterrupt.interrupt();
    }
}
public class ThreadJoinInterruptedExample {

    public static void main(String[] args) {
         try {
             InterruptedExceptionExample th1 = new InterruptedExceptionExample();
             th1.threadToInterrupt = Thread.currentThread();
             th1.start();
             //Invoking the join() method leads to the generation of InterruptedException
             th1.join();
         }catch (InterruptedException e){
             System.out.println("The Exception has been caught : " + e);
         }
    }
}
