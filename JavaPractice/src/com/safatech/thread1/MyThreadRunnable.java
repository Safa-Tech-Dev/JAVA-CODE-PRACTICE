package com.safatech.thread1;

class MyThreadClass1 implements Runnable{
    public void run(){

        for(int i = 1; i<=10; i++){
            System.out.println("The value of i:" + i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}
public class MyThreadRunnable{

    public static void main(String[] args) {

        MyThreadClass1 t1 = new MyThreadClass1();
        Thread thread1 = new Thread(t1);
        MyTheadClass t2 = new MyTheadClass();
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
