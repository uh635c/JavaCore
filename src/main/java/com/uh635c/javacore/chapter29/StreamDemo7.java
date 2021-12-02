package main.java.com.uh635c.javacore.chapter29;

import java.util.*;
import java.util.stream.*;

class NamePhoneEmail1 {
    String name;
    String phonenum;
    String email;
    NamePhoneEmail1(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}
class NamePhone1 {
    String name;
    String phonenum;
    NamePhone1(String n, String p) {
        name = n;
        phonenum = p;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));

        Stream<NamePhone1> nameAndPhone = myList.stream().map((a)->new NamePhone1(a.name, a.phonenum));

        List<NamePhone1> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Names and phone numbers in a List:");
         for(NamePhone1 np : npList){
             System.out.println(np.name + " " + np.phonenum);
         }

        nameAndPhone = myList.stream().map((a) -> new NamePhone1(a.name,a.phonenum));
        Set<NamePhone1> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nNames and phone numbers in a Set:");
        for(NamePhone1 np : npSet){
            System.out.println(np.name + " " + np.phonenum);
        }
    }
}
