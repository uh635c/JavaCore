package main.java.com.uh635c.javacore.chapter29;

import java.util.*;
import java.util.stream.*;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>( );
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Spliterator<String> spliterator = myStream.spliterator();

        Spliterator<String> spliterator1 = spliterator.trySplit();

        if(spliterator1!=null){
            System.out.println("Output from iterator1: ");
            spliterator1.forEachRemaining(System.out::println);
        }

        System.out.println("\nOutput from spliterator: ");
        spliterator.forEachRemaining(System.out::println);
    }
}
