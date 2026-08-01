package JavaPractice.src.com.safatech.thread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    static void main() {

        CompletableFuture<String> f1 = CompletableFuture
                .supplyAsync(() -> "Saddam")
                .thenApply(String::toUpperCase)
                .thenCombine(CompletableFuture.supplyAsync(() -> "Farheen"), (s1, s2) -> s1 + " & " + s2)
                .thenApply(String::toUpperCase);
        IO.println(f1.join());
    }
}
