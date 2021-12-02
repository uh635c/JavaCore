package main.java.com.uh635c.javacore.chapter22;

import java.net.*;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);
        System.out.println(Address.getHostAddress());
        System.out.println(Address.getHostName());
        System.out.println(Address.isMulticastAddress());
        System.out.println(Address.toString());

        InetAddress[] SW = InetAddress.getAllByName("www.mail.ru");
        for(int i = 0; i < SW.length; i++){
            System.out.println(SW[i]);
        }
    }
}
