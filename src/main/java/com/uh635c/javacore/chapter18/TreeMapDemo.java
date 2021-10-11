package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>();

        //заполнить древовидное отображение
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество записей
        for(Map.Entry<String, Double> entry : set){
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        System.out.println();

        //пополнить баланс Джона Доу на 1000
        tm.put("Джон Доу", tm.get("Джон Доу")+1000);
        System.out.println("Новый остаток Джона Доу: " + tm.get("Джон Доу"));

    }

}