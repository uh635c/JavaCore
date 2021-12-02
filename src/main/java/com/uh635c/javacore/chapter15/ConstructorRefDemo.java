package main.java.com.uh635c.javacore.chapter15;

interface MyFuncConstrRef {
    MyClasss func(int n);
}

class MyClasss {
    private int val;

    MyClasss(int v) {
        val = v;
    }

    MyClasss() {
        val = 0;
    }

    public int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFuncConstrRef myClassCons= MyClasss::new;
        MyClasss mc = myClassCons.func(100);
        System.out.println("val in mc is "+ mc.getVal());
    }

}
