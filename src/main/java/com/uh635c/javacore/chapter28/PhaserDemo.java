package main.java.com.uh635c.javacore.chapter28;

import java.util.concurrent.*;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;

        System.out.println("Starting.");

        new MeThread(phaser, "A");
        new MeThread(phaser, "B");
        new MeThread(phaser, "C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete.");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete.");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " complete.");


        phaser.arriveAndDeregister();

        if(phaser.isTerminated()){
            System.out.println("The Phaser is terminated.");
        }
    }
}

class MeThread implements Runnable{
    Phaser phaser;
    String name;

    MeThread(Phaser p, String n){
        phaser = p;
        name = n;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " Beginning Phase One");
        phaser.arriveAndAwaitAdvance();

        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread " + name + " Beginning Phase Two");
        phaser.arriveAndAwaitAdvance();

        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread " + name + " Beginning Phase Three");
        phaser.arriveAndDeregister();
    }
}
