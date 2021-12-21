package main.java.com.uh635c.javacore.chapter28;

import java.util.concurrent.locks.*;

public class LockDemo {
    public static void main(String args[]) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

class Sharedd {
    static int count = 0;
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
        new Thread(this).start();
    }
    public void run() {
        System.out.println("Starting " + name);

        try {
            System.out.println(name + " is waiting to lock count.");
            lock.lock();
            System.out.println(name + " is locking count.");
            Sharedd.count++;
            System.out.println(name + ": " + Sharedd.count);

            System.out.println(name + " is sleeping.");
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {

            System.out.println(name + " is unlocking count.");
            lock.unlock();
        }
    }
}