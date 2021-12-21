package main.java.com.uh635c.javacore.chapter11;

class A{
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered to A.foo().");

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("A interrupted");
        }

        System.out.println(name + " trying to call B.bar().");
        b.last();
    }

    synchronized void last(){
        System.out.println("Inside A.last.");
    }
}

class B{
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered to B.bar().");

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("B interrupted");
        }

        System.out.println(name + " trying to call A.foo()");
        a.last();
    }

    synchronized void last(){
        System.out.println("Inside B.last.");
    }
}

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        a.foo(b);
        System.out.println("Back in main thread.");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back in other thread.");
    }
    public static void main(String[] args) {
        new Deadlock();
    }
}
