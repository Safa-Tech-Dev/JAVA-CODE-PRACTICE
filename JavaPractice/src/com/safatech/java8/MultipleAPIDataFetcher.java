package com.safatech.java8;

import java.util.concurrent.CompletableFuture;

public class MultipleAPIDataFetcher {

    public CompletableFuture<String> fetchWeatherData(){

        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(2000); //simulate Network delay
            return "Weather: Sunny, 25°C";
        });
    }
    public CompletableFuture<String> fetchNewsHeadLine(){

        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(3000); //simulate Network delay
            return "News: Java 24 Released";
        });
    }
    public CompletableFuture<String> fetchStockPrices(){

        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1500); //simulate Network delay
            return "Stocks: APPL - $150, GOOGL - $2800";
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

        MultipleAPIDataFetcher fetcher = new MultipleAPIDataFetcher();
        //combine multiple independent future( more than 2 ) -> allOf(n task)
        //WeatherDetails APIs
        CompletableFuture<String> weatherFuture = fetcher.fetchWeatherData();
        //New APIs
        CompletableFuture<String> newsFuture = fetcher.fetchNewsHeadLine();
        //stockPrice APIs
        CompletableFuture<String> stockPriceFuture = fetcher.fetchStockPrices();

        // Wait for all future to complete
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(weatherFuture, newsFuture, stockPriceFuture);

        // Process results after  all future are completed
        allFutures.thenRun(() ->{
            String weather = weatherFuture.join();
            String news = newsFuture.join();
            String stock = stockPriceFuture.join();
            System.out.println("Aggregated Data: " );
            System.out.println(weather);
            System.out.println(news);
            System.out.println(stock);
        }).join();
    }
}
