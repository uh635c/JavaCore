package main.java.com.uh635c.javacore.chapter18;

import java.util.*;

//Компаратор для сравнения символьных строк в обратном порядке
class MyComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String aStr, bStr;
        aStr = o1;
        bStr = o2;
        //выполнить сранение в обратном порядке
        return bStr.compareTo(aStr);
    }

    //переопределение метода equals() не требуется
}

public class CompDemo {
    public static void main(String[] args) {
        //создать древовидное множество TreeSet
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        //заполнить древовидно множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //вывести элементы из древовидного множества
        for(String str : ts){
            System.out.print(str + ", ");
        }
    }
}
