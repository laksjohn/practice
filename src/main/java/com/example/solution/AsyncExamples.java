package com.example.solution;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncExamples {

    public static void main (String[] args) throws InterruptedException, ExecutionException {

        AsyncExamples asyncExamples = new AsyncExamples();
        Future<String> completableFuture = asyncExamples.calculateAsync();
        String result = completableFuture.get();



    }

    public Future<String> calculateAsync() throws InterruptedException {

        CompletableFuture<String> completableFuture = new CompletableFuture<>();



        Executors.newCachedThreadPool().submit(()->{
            Thread.sleep(500);
            completableFuture.complete("Hello World");
            return null;
        });


        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()->10)
                .thenApplyAsync(result -> result+1)
                .thenApplyAsync(result-> result*2);

        future.thenAccept(result->System.out.println(result));

        //Future<String> future1 = Future.future();

        return completableFuture;
    }

}
