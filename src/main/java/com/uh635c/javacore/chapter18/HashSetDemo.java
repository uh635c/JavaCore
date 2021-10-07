package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        //создать хеш-множество
        HashSet<String> hs = new HashSet<>();

        //ввести элементы в хеш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");
        System.out.println(hs);

        //создать линкед-хеш-множество
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        //ввести элементы в линкед-хеш-множество
        lhs.add("Бета");
        lhs.add("Альфа");
        lhs.add("Эта");
        lhs.add("Гамма");
        lhs.add("Эпсилон");
        lhs.add("Омега");
        System.out.println(lhs);
    }
}
