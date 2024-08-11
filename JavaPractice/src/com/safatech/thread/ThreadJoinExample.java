package com.safatech.thread;

//A program for understanding joining of tread
class ThreadJoin extends Thread{

    //Overriding run method
    public void run(){

        for(int j = 0; j< 2; j++){

            try{
                //sleep the thread for 3 sec
                Thread.sleep(300);
                System.out.println("The current thread name is : " + Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println("The exception has been caught: " + e.getMessage());
            }
            System.out.println(j);
        }
    }
}
public class ThreadJoinExample {

    public static void main(String[] args) {

        //creating 3 thread
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        //thread t1 starts
        t1.start();

        //starting the t2 thread after when first thread t1 has ended or died
        try{
            System.out.println("The Current thread name is : " + Thread.currentThread().getName());
            t1.join();
        }catch(Exception e){
            System.out.println("The exception has been caught: " + e.getMessage());
        }
        //thread t2 starts
        t2.start();

        //starting the t3 thread after when first thread t2 has ended or died
        try{
            System.out.println("The Current thread name is : " + Thread.currentThread().getName());
            t2.join();
        }catch(Exception e){
            System.out.println("The exception has been caught: " + e.getMessage());
        }
        t3.start();
    }
}
