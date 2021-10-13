package main.java.com.uh635c.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Флорида", "Тэлесси");
        defList.put("Висконсин", "Мэдисон");
        Properties capitals = new Properties(defList);
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

        //теперь штат Флорида будет найден в списке по умолчанию
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица штата Флорида - " + str + ".");
    }
}
