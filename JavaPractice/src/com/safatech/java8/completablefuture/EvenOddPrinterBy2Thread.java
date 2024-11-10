package com.safatech.java8.completablefuture;

public class EvenOddPrinterBy2Thread implements Runnable{

    static int count = 1;
    Object object;

    //approach 1 with Java 7
    public EvenOddPrinterBy2Thread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        while(count <= 10){
            if(count % 2 == 0 && Thread.currentThread().getName().equals("even")){
                synchronized (object){
                    System.out.println("Thread name : " + Thread.currentThread().getName() + " value " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if(count % 2 != 0 && Thread.currentThread().getName().equals("odd")){
                synchronized (object){
                    System.out.println("Thread name : " + Thread.currentThread().getName() + " value " + count);
                    count++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {

        Object lock = new Object();
        Runnable r1 = new EvenOddPrinterBy2Thread(lock);
        Runnable r2 = new EvenOddPrinterBy2Thread(lock);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();
    }
}

