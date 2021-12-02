package main.java.com.uh635c.javacore.chapter29;

import java.util.*;
import java.util.stream.*;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Optional<Integer> productObj = myList.stream().reduce((a,b)->a*b);
        if(productObj.isPresent()){
            System.out.println("Product as Optional: " + productObj.get());
        }

        int product = myList.stream().reduce(1, (a,b)->a*b);
        System.out.println("Product as int: " + product);
    }
}
