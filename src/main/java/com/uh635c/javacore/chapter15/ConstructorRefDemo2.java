package main.java.com.uh635c.javacore.chapter15;

interface MyFuncConstrRef1<T>{
    MyClasses<T> func(T n);
}

class MyClasses<T>{
    private T val;

    MyClasses(T v){
        val = v;
    }

    MyClasses(){
        val = null;
    }

    public T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFuncConstrRef1<Integer> myClassCons = MyClasses<Integer>::new;
        MyClasses<Integer> mc = myClassCons.func(100);
        System.out.println("val in mc is " + mc.getVal( ));
    }
}
