package com.safatech.thread1;

public class Company {

    int n;
    Boolean flag = false;
    //flag = false producer chance
    //flag = true consumer chance
    synchronized public void produce_item(int n) throws InterruptedException {
        if(flag){
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        flag = true;
        notify();
    }
    synchronized public int consume_item() throws InterruptedException {

        if(!flag){
            wait();
        }
        System.out.println("Consumed: " + this.n);
        flag = false;
        notify();
        return this.n;
    }
}
