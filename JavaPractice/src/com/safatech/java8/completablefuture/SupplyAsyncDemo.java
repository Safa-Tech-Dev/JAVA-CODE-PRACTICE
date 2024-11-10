package com.safatech.java8.completablefuture;

import com.safatech.java8.dao.EmployeeJsonDB;
import com.safatech.java8.model.EmployeeJson;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {

    public List<EmployeeJson> getEmployees() throws ExecutionException, InterruptedException {

        Executor executor = Executors.newCachedThreadPool();

        CompletableFuture<List<EmployeeJson>> listCompletableFuture = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Thread: " + Thread.currentThread().getName());
            return EmployeeJsonDB.fetchEmployee();
        }, executor);
        return listCompletableFuture.get();
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SupplyAsyncDemo supplyAsyncDemo = new SupplyAsyncDemo();
        List<EmployeeJson> supplyAsyncDemoEmployees = supplyAsyncDemo.getEmployees();
        supplyAsyncDemoEmployees.stream().forEach(System.out::println);

    }
}
