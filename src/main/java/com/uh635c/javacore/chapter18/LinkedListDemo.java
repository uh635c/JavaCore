package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // создать связаный список
        LinkedList<String> ll = new LinkedList<>();

        // ввести элементы в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");
        System.out.println("Исходное содержимое связного списка ll: " + ll);

        // удалитьэлементы из связного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое связного скиска ll после удаления элементов: " + ll);

        // удалить первый и послединй элементы из связного списка
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Содержимое связного скиска ll после удаления первого и последнего элементов: " + ll);

        // получить и присвоить значения
        String val = ll.get(2);
        ll.set(2, val + "изменено");
        System.out.println("Содержимое связного списка ll после изменения: " + ll);
    }
}
