package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

//Компаратор сравнивающий фамили вкладчиков
class CompLastName implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int i, j;

        //найти индекс символа с которого начинается фамилия
        i = o1.lastIndexOf(" ");
        j = o2.lastIndexOf(" ");
        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}

//Отсортировать счета вкладчиков по ФИО если фамилии вкладчиков одинаковые
class CompThenByFirstName implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}

public class TreeMapDemo2A {
    public static void main(String[] args) {
        //использоват метод thenComparing() для создания компаратора, сравнивающего сначала
        //фамили, а затем ФИО вкладчиков, если фамилии одинаковые
        CompLastName compLastName = new CompLastName();
        Comparator<String> comparator = compLastName.thenComparing(new CompThenByFirstName());

        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(comparator);

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
