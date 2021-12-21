package main.java.com.uh635c.javacore.Module_14_task;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Foo implements Runnable {
    private static AtomicInteger counter = new AtomicInteger(1);
    Phaser phaser = new Phaser(3);

    public  void first() {
        System.out.println(("first"));
    }

    public  void second() {
        System.out.println("second");
    }

    public  void third() {
        System.out.println("third");
    }


    @Override
    public void run() {
        int threadNumber = counter.getAndAdd(1);

        if (threadNumber == 2 || threadNumber == 3) {
            phaser.arriveAndAwaitAdvance();
        } else {
            first();
            phaser.arriveAndDeregister();
            return;
        }
        if (threadNumber == 2) {
            phaser.arriveAndAwaitAdvance();
        } else {
            second();
            phaser.arriveAndDeregister();
            return;
        }
        third();
        phaser.arriveAndDeregister();
    }
}
