package main.java.com.uh635c.javacore.chapter28;

import java.util.concurrent.*;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

class Shared {
    static int count = 0;
}

class IncThread implements Runnable {
    Semaphore sem;
    String name;

    IncThread(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Starting: " + name);

        try {
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();
            System.out.println(name + " gets a permit.");

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(name + " releases the permit.");
        sem.release();
    }
}

class DecThread implements Runnable {
    String name;
    Semaphore sem;

    DecThread(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Starting " + name);
        try {

            System.out.println(name + " is waiting for a permit.");
            sem.acquire();
            System.out.println(name + " gets a permit.");

            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(name + " releases the permit.");
        sem.release();
    }
}

