package main.java.com.uh635c.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42/a;
        }catch(ArithmeticException e){
            System.out.println("This is never reached.");
        }catch(Exception e){
                System.out.println("Generic exception catch.");
        }
    }
}
