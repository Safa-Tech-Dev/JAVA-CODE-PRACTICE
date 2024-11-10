package com.safatech.java8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExampleHandlingCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //update Employee DB
        CompletableFuture<String> employeeDataFuture = CompletableFuture.supplyAsync(() -> {
            gracefullyShutDown("Employee");
            return "Employee information update in DB";
        });
//                .exceptionally( ex ->{
//            System.out.println("Unable to update Employee information in DB");
//            return "500 Internal Server Error.";
//        });
        CompletableFuture<String> employeeDocumentFuture = CompletableFuture.supplyAsync(() -> {
//            gracefullyShutDown("S3");
            return "Employee document update in S3";
        });
//                .exceptionally( ex ->{ // local exception handling
//            System.out.println("Unable to update Employee document in S3");
//            return "500 Internal Server Error.";
//        });

        CompletableFuture<String> combineFuture = employeeDataFuture.
                thenCombine(employeeDocumentFuture, (result1, result2) -> {
            return result1 + "\n" + result2;
        })
                // Global Exception Handling
                .handle( (res,ex) ->{
                    if(ex != null){
                        System.out.println("An error occured while processing the employee data." + ex.getMessage());
                        return "Operation failed";
                    }
                    return res;
                });
        System.out.println(combineFuture.get());
    }

    private static void gracefullyShutDown(String apiName){

        throw new RuntimeException(apiName + " Service temporarily unavailable. please try again after sometime.");
    }
}
