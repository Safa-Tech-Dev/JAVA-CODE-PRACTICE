package com.safatech.thread1;
class UserThread extends Thread{

    public void run(){

        System.out.println("task for user defined thread1...");
    }
}
public class ThreadOperation {

    public static void main(String[] args) {
        System.out.println("Program started...");
        int x = 56+34;
        System.out.println("The Value of x: " + x);

        Thread t = Thread.currentThread();
        String tName = t.getName();
        System.out.println("Current runninng thread1: " + tName);
        t.setName("MyThread");
        System.out.println(t.getName());
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println(t.getId());

        UserThread thread = new UserThread();
        thread.start();
        System.out.println("Program ended...");
    }
}
