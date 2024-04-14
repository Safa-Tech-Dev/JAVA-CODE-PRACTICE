package com.safatech.thread1;
public class MyTheadClass extends Thread{

    public void run(){
        for(int i = 10; i>= 1; i--){
            System.out.println("Second thread1 i: " + i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}
