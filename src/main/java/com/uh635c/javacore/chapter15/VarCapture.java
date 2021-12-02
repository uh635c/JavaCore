package main.java.com.uh635c.javacore.chapter15;

interface MyFunc{
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        int num=10;

        MyFunc myLambda = (n)->{
            //This use of num is OK. It does not modify num.
            int v = num+n;

            //However, the following is illegal because it attempts to modify the value of num.
        //  num ++
             return v;
        };

        //The following line would also an error, because it would remove the effectively finsl status from num.
        // num = 9;
    }
}
