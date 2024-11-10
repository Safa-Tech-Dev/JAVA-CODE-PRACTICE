package com.safatech.java8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinterByCompletableFuture {

    private static Object object = new Object();
    private static IntPredicate evenCondition = e -> e % 2 == 0;
    private static IntPredicate oddCondition = o -> o % 2 != 0;


    public static void printResults(IntPredicate condition){

        IntStream.rangeClosed(1,10)
                .filter(condition)
                .forEach(EvenOddPrinterByCompletableFuture::execute);
    }

    public static void execute(int i){

        synchronized (object){
            try {
                System.out.println("Thread name : " + Thread.currentThread().getName() + " : " +i);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                // log error
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.runAsync( () -> EvenOddPrinterByCompletableFuture.printResults(evenCondition));
        CompletableFuture.runAsync( () -> EvenOddPrinterByCompletableFuture.printResults(oddCondition));
        Thread.sleep(1000);
    }


}
