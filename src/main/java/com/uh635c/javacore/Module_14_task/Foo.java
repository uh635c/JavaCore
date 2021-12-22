package main.java.com.uh635c.javacore.Module_14_task;

import java.util.concurrent.*;

public class Foo {
    Phaser phaser = new Phaser(3);

    public  void first(Runnable r) {
        System.out.println(("first"));
        phaser.arriveAndDeregister();
    }

    public  void second(Runnable r) {
        phaser.arriveAndAwaitAdvance();
        System.out.println("second");
        phaser.arriveAndDeregister();
    }

    public  void third(Runnable r) {
        phaser.arriveAndAwaitAdvance();
        phaser.arriveAndAwaitAdvance();
        System.out.println("third");
        phaser.arriveAndDeregister();
    }
}
