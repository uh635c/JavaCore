package main.java.com.uh635c.javacore.Module_14_task;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {

            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {

            }
        };

        CompletableFuture.runAsync(()-> foo.third(r1));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CompletableFuture.runAsync(()-> foo.second(r2));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CompletableFuture.runAsync(()-> foo.first(r3));

        // wait demon threads executed above
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
