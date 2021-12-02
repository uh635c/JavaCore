package main.java.com.uh635c.javacore.chapter15;

interface NumericFun {
    int fun(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFun numericFun = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        System.out.println("The factorial of 3 is " + numericFun.fun(3));
        System.out.println("The factorial of 5 is " + numericFun.fun(5));
    }
}
