package main.java.com.uh635c.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);

        System.out.println("Starting");

        new MyThread(cdl);

        try{
            cdl.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Done");
    }
}

class MyThread implements Runnable{
    CountDownLatch cdl;

    MyThread(CountDownLatch cdl){
        this.cdl = cdl;
        new Thread(this).start();
    }


    @Override
    public void run() {
        for(int i = 0; i< 5; i++){
            System.out.println(i);
            cdl.countDown();
        }
    }
}
