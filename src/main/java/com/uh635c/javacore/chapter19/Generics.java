package main.java.com.uh635c.javacore.chapter19;

import java.io.IOException;
import java.lang.reflect.Field;

public class Generics {
    public static void main(String[] args) throws IOException {
        Zoo<? super Dog> cell = new Zoo<Animal>();
        cell.setT(new Taksa());
        System.out.println(cell.getT());
        Class c = cell.getClass();
        Field[] fields = c.getFields();
        System.out.println("dsfsdf");
        System.out.println(fields[0].getType());
        System.out.println(fields[0].getName());


        /*cell.setT(new Taksa());
        Dog t = cell.getT();
        System.out.println(cell.getT().getClass());
        cell.setT(new Dog());
        System.out.println(cell.getT());
        cell.setT(new Animal());*/
    }
}

class Animal { }

class Dog extends Animal { }

class Taksa extends Dog { }


class Zoo<T> {
    T t;
    int i;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }


}