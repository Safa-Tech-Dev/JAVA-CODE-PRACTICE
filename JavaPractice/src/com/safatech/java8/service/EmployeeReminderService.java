package com.safatech.java8.service;

import com.safatech.java8.dao.EmployeeJsonDB;
import com.safatech.java8.model.EmployeeJson;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class EmployeeReminderService {

    public CompletableFuture<Void> sendReminderToEmployee(){

        Executor executor = Executors.newFixedThreadPool(5);
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("fetch Employee: " + Thread.currentThread().getName());
            return EmployeeJsonDB.fetchEmployee();
        }, executor).thenApplyAsync((employees) -> {
            System.out.println("Filter new joiner employees" + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equals(employee.getNewJoiner()))
                    .collect(Collectors.toList());

        }, executor).thenApplyAsync((employees) -> {

            System.out.println("Filter training pending employees" + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equals(employee.getLearningPending()))
                    .collect(Collectors.toList());
        }, executor).thenApplyAsync((employees) -> {
            System.out.println(" Get emails " + Thread.currentThread().getName());
            return employees.stream()
                    .map(EmployeeJson::getEmail)
                    .collect(Collectors.toList());
        }, executor).thenAcceptAsync((emails) -> {
            System.out.println(" Send emails " + Thread.currentThread().getName());
            emails.forEach(EmployeeReminderService::sendEmail);
        }, executor);
        return voidCompletableFuture;
    }

    public static void sendEmail(String email){
        System.out.println("Sending training reminder email:" + email);
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        EmployeeReminderService employeeReminderService = new EmployeeReminderService();
        employeeReminderService.sendReminderToEmployee().get();

    }
}
