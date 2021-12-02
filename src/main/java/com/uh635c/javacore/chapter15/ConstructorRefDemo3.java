package main.java.com.uh635c.javacore.chapter15;

interface MyFuncc<R, T> {
    R func(T n);
}

class MyClas<T> {
    T val;

    MyClas(T v) {
        val = v;
    }

    MyClas() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}

class MyClass2 {
    String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = "";
    }

    String getVal() {
        return str;
    }
}

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFuncc<R, T> f, T t) {
        return f.func(t);
    }

    public static void main(String[] args) {
        MyFuncc<MyClas<Double>, Double> mf = MyClas<Double>::new;
        MyClas<Double> mc = myClassFactory(mf, 100.1);
        System.out.println("val in mc is " + mc.getVal());

        MyFuncc<MyClass2, String> mf2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(mf2, "Lambda");
        System.out.println("str in mc2 is " + mc2.getVal());

    }
}

