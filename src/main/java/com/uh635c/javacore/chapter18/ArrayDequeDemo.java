package main.java.com.uh635c.javacore.chapter18;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //создать двухсторонюю очередь
        ArrayDeque<String> adq = new ArrayDeque<>();

        //использовать калвв для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println(adq);

        System.out.println("извлечение из стека:");

        while(adq.peek()!=null)
            System.out.print(adq.pop() + " ");
    }
}
