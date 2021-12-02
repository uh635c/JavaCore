package main.java.com.uh635c.javacore.chapter15;

interface NumericTest2 {
    boolean test(int n, int d);
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 numericTest2 = (n, d) -> (n % d) == 0;

        if(numericTest2.test(10,2)){
            System.out.println("2 is a factor of 10");
        }
        if(!numericTest2.test(10,3)){
            System.out.println("3 is not a factor of 10");
        }
    }
}
