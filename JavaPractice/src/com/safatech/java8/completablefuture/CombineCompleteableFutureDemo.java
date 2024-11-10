package com.safatech.java8.completablefuture;

import com.safatech.java8.dao.EmployeeJsonDB;
import com.safatech.java8.model.EmployeeJson;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CombineCompleteableFutureDemo {


    public CompletableFuture<EmployeeJson> getEmployeeDetails(){
        return CompletableFuture.supplyAsync(() ->{
            System.out.println("getEmployeeDetails" + Thread.currentThread().getName());
            return EmployeeJsonDB.fetchEmployee()
                    .stream()
                    .filter( emp -> "79-021-3776".equals(emp.getEmployeeId()))
                    .findAny().orElse(null);
        });

    }

    public CompletableFuture<Integer> getRatings(EmployeeJson employee){

        return CompletableFuture.supplyAsync( () ->{
            System.out.println("getRatings" + Thread.currentThread().getName());
            return employee.getRating();
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CombineCompleteableFutureDemo cf = new CombineCompleteableFutureDemo();
        CompletableFuture<Integer> thenComposeResult = cf.getEmployeeDetails().thenCompose(cf::getRatings);
        System.out.println("Rating: " + thenComposeResult. get());


        //Combine dependent future (2)
        //employee -> ratings


        //combine independent future (2) -> thenCombine() method
        //1 - group employee and counts
        CompletableFuture<Map<String, Long>> employeeMapFuture = CompletableFuture.supplyAsync(() -> {
            return EmployeeJsonDB.fetchEmployee()
                    .stream()
                    .collect(Collectors.groupingBy(EmployeeJson::getGender, Collectors.counting()));
        });

        //2 - get all emails
        CompletableFuture<List<String>> emailFuture = CompletableFuture.supplyAsync(() -> {
            return EmployeeJsonDB.fetchEmployee()
                    .stream()
                    .map(EmployeeJson::getEmail)
                    .collect(Collectors.toList());
        });

        CompletableFuture<String> thenCombineResults = employeeMapFuture.thenCombine(emailFuture, (empMap, emails) ->
                empMap + " " + emails);
        System.out.println(thenCombineResults);


        //combine multiple independent future( more than 2 ) -> allOf(n task)
        //combine multiple independent future( more than 2 ) -> anyOf(n task) (no need  to wait for all)
        //Location -> X,Y -> result
        //Stock Price -> x,y,z

    }

}
