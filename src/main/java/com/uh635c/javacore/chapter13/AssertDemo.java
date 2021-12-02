package main.java.com.uh635c.javacore.chapter13;

public class AssertDemo {
    static int val = 3;

    //return an integer
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n= getnum();
            assert n>0; // will fail when b is 0
            System.out.println("n is " + n);
        }
    }
}
