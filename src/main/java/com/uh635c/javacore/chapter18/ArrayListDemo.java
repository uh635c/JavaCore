package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //создать списочный массив
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Начальный размер списочного массива al: " + al.size());

        // ввести элеметны в список массива
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println("Размер списочного массива al после ввода элементов: " + al.size());

        //вывести список массива
        System.out.println("Содержимое списочного массива al: " + al);

        //удаление элементов из списочного массива
        al.remove("F");
        al.remove(2);
        System.out.println("Рзамер списочного масива al после удаления элементов: " + al.size());

        System.out.println("Сщдержимое списочного массива al: " + al);
    }
}
