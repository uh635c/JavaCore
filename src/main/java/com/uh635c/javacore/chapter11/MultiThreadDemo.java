package main.java.com.uh635c.javacore.chapter11;

class NewThread2 implements Runnable{
    String name;
    Thread t;

    NewThread2(String threadname){
        name = threadname;
        t= new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("One");
        new NewThread2("Two");
        new NewThread2("Three");

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
