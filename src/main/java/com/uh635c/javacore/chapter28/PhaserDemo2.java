package main.java.com.uh635c.javacore.chapter28;

import java.util.concurrent.*;

class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Phase " + phase +  " completed.\n");

        if(phase == numPhases || registeredParties == 0){
            return true;
        }
        return false;
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser myPhaser = new MyPhaser(1, 4);

        System.out.println("Starting.\n");

        new MyyThread(myPhaser, "A");
        new MyyThread(myPhaser, "b");
        new MyyThread(myPhaser, "C");

        while (!myPhaser.isTerminated()){
            myPhaser.arriveAndAwaitAdvance();
        }

        System.out.println("The Phaser is terminated.");
    }
}

class MyyThread implements Runnable{
    MyPhaser myPhaser;
    String name;

    MyyThread(MyPhaser p, String s){
        myPhaser = p;
        name = s;
        myPhaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(!myPhaser.isTerminated()){
            System.out.println("Thread " + name + " Beginning Phase " + myPhaser.getPhase());
            myPhaser.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
