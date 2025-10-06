package JavaPractice.src.com.safatech.thread;

import JavaPractice.src.com.safatech.thread.Consumer;
import JavaPractice.src.com.safatech.thread.Producer;

public class MainThread {
    public static void main(String[] args) {
        com.safatech.thread.Company company = new com.safatech.thread.Company();
        Producer p = new Producer(company);
        Consumer c = new Consumer(company);
        p.start();
        c.start();
    }
}
