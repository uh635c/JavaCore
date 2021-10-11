package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //создать хеш-отображение
        HashMap<String, Double> hm = new HashMap<>();

        //ввести элементы в хеш-отображение
        hm.put("Джон Доу", new Double(3434.34));
        hm.put("Том Смит", new Double(123.22));
        hm.put("Джуйн Бейкер", new Double(1378.00));
        hm.put("Тщд Холл", new Double(99.22));
        hm.put("Ральф Смит", new Double(-19.08));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //вывести множество записей
        for(Map.Entry<String, Double> entry : set){
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет Джон Доу
        double balance = hm.get("Джон Доу");
        hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый баланс Джона Доу: " + hm.get("Джон Доу"));
    }
}
