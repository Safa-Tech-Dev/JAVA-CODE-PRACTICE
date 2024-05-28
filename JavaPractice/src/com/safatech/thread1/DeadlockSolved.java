package com.safatech.thread1;

public class DeadlockSolved {

    public static void main(String[] args) {

        DeadlockSolved test = new DeadlockSolved();

        final resource1 r1 = test.new resource1();
        final resource2 r2 = test.new resource2();

        //Thread-1
        Runnable b1 = new Runnable() {
            @Override
            public void run() {
               synchronized (r2){
                   try{
                       //Adding delay so that both threads can start trying to lock resources
                       Thread.sleep(100);
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }
                   //Thread - 1 have resource1 but need resource2 also
                   synchronized (r1){
                       System.out.println("in block 1");
                   }
               }
            }
        };
        //Thread-2
        Runnable b2 = new Runnable() {
            @Override
            public void run() {
               synchronized (r2){
                   //Thread - 2 have resource2 but need resource1 also
               }

                synchronized (r1){
                    System.out.println("in block 2");
                }
            }
        };

        new Thread(b1).start();
        new Thread(b2).start();
    }
    private class resource1{

        private  int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
    private class resource2{

        private  int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}

