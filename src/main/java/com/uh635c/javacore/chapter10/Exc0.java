package main.java.com.uh635c.javacore.chapter10;

public class Exc0 {
    public static void main(String args[]){
        int d = 0;
        int a = 42 / d;
    }
}

class Exc1 {
    static void subroutine(){
        int d = 0;
        int a = 10/d;
    }
    public static void main(String[] args) {
        subroutine();
    }
}

class Exc2{
    public static void main(String[] args) {
        int a, d;
        try{
            d=0;
            a = 42/d;
            System.out.println("This will not be printed.");
        }catch(ArithmeticException e){
            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement.");
    }
}