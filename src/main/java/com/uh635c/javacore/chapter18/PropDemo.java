package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиано", "Индианаполис");

        //получить множество ключей
        Set<?> set = capitals.keySet();

        //показать все шататы и их столицы
        for(Object name : set){
            System.out.println("Столица щтата " + name + " - " + capitals.getProperty((String)name));
        }
        System.out.println();

        //найти штат, отсутствующий в списке, указав значения выбираемые по умолчанию
        String str = capitals.getProperty("Флорида", "не найден");
        System.out.println("Столица штата Флорида " + str + ".");
    }
}
