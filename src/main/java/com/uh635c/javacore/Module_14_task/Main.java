package main.java.com.uh635c.javacore.Module_14_task;


import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();

        CompletableFuture.runAsync(foo);
        CompletableFuture.runAsync(foo);
        CompletableFuture.runAsync(foo);

    }
}
