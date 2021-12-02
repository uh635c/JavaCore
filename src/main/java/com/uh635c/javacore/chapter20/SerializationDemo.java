package main.java.com.uh635c.javacore.chapter20;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream objOStrmj = new ObjectOutputStream(new FileOutputStream("serial"))){
            MyClass object1 = new MyClass("Hello", -7,2.7e10);
            System.out.println("object1: " + object1);

            objOStrmj.writeObject(object1);

        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }

        try(ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))){
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during deserialization: " + e);
        }
    }
}

class MyClass implements Serializable{
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}
