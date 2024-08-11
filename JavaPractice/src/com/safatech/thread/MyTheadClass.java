package com.safatech.thread;
public class MyTheadClass extends Thread{

    public void run(){
        for(int i = 10; i>= 1; i--){
            System.out.println("Second thread i: " + i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}
