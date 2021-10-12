package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

class TComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int i, j, k;
        //найти индекс символа с которого начинается фамилия
        i = o1.lastIndexOf(" ");
        j = o2.lastIndexOf(" ");
        k = o1.substring(i).compareTo(o2.substring(j));
        if(k == 0){                     //фамилии совпадают, проверить имя и фамилию полностью
            return o1.compareTo(o2);
        }
        return k;
    }
    //переопределять метод equals() не требуется
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        //заполнить древовидное отображение
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Ральф Смит", -19.08);

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
