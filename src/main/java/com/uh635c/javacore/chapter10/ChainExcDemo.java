package main.java.com.uh635c.javacore.chapter10;

//Demonstrate exception chaining
public class ChainExcDemo {
    static void demoproc(){

        //create an exception
        NullPointerException e = new NullPointerException("top layer");

        //add a cause
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            //display top layer exception
            System.out.println("Caught: " + e);

            //display cause exception
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
