package com.safatech.java8.completablefuture;

import java.util.concurrent.CompletableFuture;

public class StockPriceDataFetcher {

    public CompletableFuture<Double> fetchStockPriceFromApi1(String sysmbol) {
        return CompletableFuture.supplyAsync(() -> {
            //simulate a network delay
            simulateDelay(2000); // a delay of 2 sec
            return 150.0; // Simulate stock price from API 1
        });
    }
    public CompletableFuture<Double> fetchStockPriceFromApi2(String sysmbol) {
        return CompletableFuture.supplyAsync(() -> {
            //simulate a network delay
            simulateDelay(1000); // a delay of 2 sec
            return 155.0; // Simulate stock price from API 2
        });
    }
    public void simulateDelay(int millis){

        try{
            Thread.sleep(millis);
        }catch (InterruptedException exception){
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {

        StockPriceDataFetcher fetcher = new StockPriceDataFetcher();
        String stockSymbol = "APPL"; // apple inc

        // fetch stock price from both the api

        CompletableFuture<Double> api1Result = fetcher.fetchStockPriceFromApi1(stockSymbol);
        CompletableFuture<Double> api2Result = fetcher.fetchStockPriceFromApi2(stockSymbol);

        // Use anyOf to wait any of the future to complete
        CompletableFuture<Object> anyOfResults = CompletableFuture.anyOf(api1Result, api2Result);

        // process the result
        anyOfResults.thenAccept( price ->{
            System.out.println("Received the stock price: " + price);
        }).join();


    }
}
