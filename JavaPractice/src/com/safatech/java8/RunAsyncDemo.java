/*
package com.safatech.java8;

import com.safatech.java8.model.EmployeeJson;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunAsyncDemo {


  */
/*  public Void saveEmployees(File jsonFile){

        ObjectMapper mapper = new ObjectMapper();

        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(new Runnable () {

            @Override
            public void run(){
                try{
                    List<EmployeeJson> employees =  mapper.readValue(jsonFile, new TypeReference<List<EmployeeJson>>(){

                    });
                    // wrtie logic to save list of employees to database
                    //repository.saveAll(employees);
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    System.out.println(employees.size());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
        return runAsyncFuture.get();

    }*//*

    public Void saveEmployeesWithCustomExecutor(File jsonFile){

        ObjectMapper mapper = new ObjectMapper();

        Executor executor = Executors.newFixedThreadPool(5);
        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(
                () -> {
                try{
                    List<EmployeeJson> employees =  mapper.readValue(jsonFile, new TypeReference<List<EmployeeJson>>(){

                    });
                    // wrtie logic to save list of employees to database
                    //repository.saveAll(employees);
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    System.out.println(employees.size());
                }catch (IOException e){
                    e.printStackTrace();
                }
        }, executor);
        return runAsyncFuture.get();

    }

    public static void main(String[] args) {

        RunAsyncDemo runAsyncDemo = new RunAsyncDemo();
        runAsyncDemo.saveEmployees(new File("employees.json"));
        runAsyncDemo.saveEmployeesWithCustomExecutor(new File("employees.json"));
    }
}
*/
