package main.java.com.uh635c.javacore.chapter15;

interface StringFun {
    String func(String n);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFun stringFun = (str) -> {
            String result = "";
            int i;

            for (i = str.length()-1; i >= 0; i--) {
                result = result + str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda reversed is " + stringFun.func("Lambda"));
        System.out.println("Expression reversed is " + stringFun.func("Expression"));
    }
}
