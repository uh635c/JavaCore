package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        //создать неинициализированный связный список
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        //создать компараток с обратным упорядочиванием
        Comparator<Integer> r = Collections.reverseOrder();

        //отсортировать список с помощью этого компаратора
        Collections.sort(ll, r);

        System.out.print("Список отсортирован в обратном порядке: ");

        for(int i : ll){
            System.out.print(i + " ");
        }

        System.out.println();

        //перетасовать список
        Collections.shuffle(ll);

        //вывести перетасованный список
        System.out.print("Список перетасован: ");

        for(int i : ll){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Максимальное значение списка ll: " + Collections.max(ll));
        System.out.println("Минимальное значение списка ll: " + Collections.min(ll));
    }
}
