package main.java.com.uh635c.javacore.chapter15;

interface MyFunct<T> {
    int func(T[] vals, T v);
}

class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}

public class GenericMethodRefDemo {
    static <T> int myOps(MyFunct<T> f, T[] t, T v) {
        return f.func(t, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] str = {"one", "two", "three", "two"};
        int count;

        count = myOps(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");

        count = myOps(MyArrayOps::countMatching, str, "two");
        System.out.println("strs contains " + count + " Twos");
    }
}
