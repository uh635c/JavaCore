package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class CompDemo2 {
    public static void main(String[] args) {
        //передать компаратор с обратным упорядочиванием древовидному множеству TreeSet
        TreeSet<String> ts = new TreeSet<>(((o1, o2) -> o2.compareTo(o1)));

        //заполнить древовидно множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //вывести элементы из древовидного множества
        for(String str : ts){
            System.out.print(str + ", ");
        }
    }
}
