package main.java.com.uh635c.javacore.chapter15;

// a functional interface for string operations.
interface StringFuncMethodRef {
    String func(String n);
}

class MyStringOps {
    //a static method that reverses a string.
    /*static*/ String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class MethodRefDemo {
    static String stringOp(StringFuncMethodRef sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        MyStringOps strOps = new MyStringOps();

        outStr = stringOp(/*MyStringOps*/strOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
