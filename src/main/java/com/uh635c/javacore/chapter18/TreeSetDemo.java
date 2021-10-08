package main.java.com.uh635c.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>();

        //ввод элементов в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);

        System.out.println(ts.subSet("C","F"));
    }
}
