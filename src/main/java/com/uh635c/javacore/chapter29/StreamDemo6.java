package main.java.com.uh635c.javacore.chapter29;

import java.util.*;
import java.util.stream.*;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.println("Original values in myList: ");
        myList.stream().forEach((a) -> System.out.print(a + " "));
        System.out.println();

        IntStream cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));

        System.out.println("The ceilings of the values in myList: ");
        cStrm.forEach((a) -> System.out.print(a + " "));
    }
}
