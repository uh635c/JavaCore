package main.java.com.uh635c.javacore.chapter28;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new UseString(exchanger);
        new MakeString(exchanger);
    }
}

class MakeString implements Runnable {
    Exchanger<String> exchanger;
    String str;

    MakeString(Exchanger<String> exchgr) {
        exchanger = exchgr;
        str = new String();
        new Thread(this).start();
    }


    @Override
    public void run() {
        char c = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += c++;
            }

            try {
                str = exchanger.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger<String> exchanger;
    String str;

    UseString(Exchanger<String> exchgr) {
        exchanger = exchgr;
        new Thread(this).start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try{
                str = exchanger.exchange(new String());
                System.out.println("Got: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
