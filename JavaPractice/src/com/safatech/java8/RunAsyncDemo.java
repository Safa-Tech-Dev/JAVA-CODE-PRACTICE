package com.safatech.java8;

import java.io.File;
import java.util.concurrent.*;
public class RunAsyncDemo {


    public void saveEmployees(File jsonFile){

        ObjectMapper mapper = new ObjectMapper();

        CompletableFuture.runAsync(new Runnable () {

            public void run(){
               try{
                   mapper.readValue(jsonFile, new TypeReference<List<EmployeeJson>>(){});
               }catch (IOException e){

               }
            }
        });

    }
}
