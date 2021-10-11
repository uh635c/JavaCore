package main.java.com.uh635c.javacore.chapter18;


import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    Address (String n, String s, String c, String st, String cd){
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }
    public String toString() {
        return name + "\n" + street + "\n" + city +  state + code;
    }
}

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        //ввести элементы в связный список
        ml.add(new Address("J.W. West", "111 Oad Ave", "Urbane", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Line", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "967 Elm St", "Champaign", "IL", "61820"));

        //вывести список почтовых адресов
        for(Address element : ml){
            System.out.println(element +"\n");
        }
        System.out.println();
    }
}
