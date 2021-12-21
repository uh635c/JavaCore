package main.java.com.uh635c.javacore.chapter28;

import java.util.concurrent.atomic.*;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomicThread("A");
        new AtomicThread("B");
        new AtomicThread("C");
    }
}

class SharedCls{
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomicThread implements Runnable{
    String name;

    AtomicThread(String str){
        name = str;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        for(int i = 1; i<=3; i++){
            System.out.println(name + " got: " + SharedCls.ai.getAndSet(i));
        }
    }
}
