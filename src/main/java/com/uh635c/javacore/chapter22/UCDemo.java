package main.java.com.uh635c.javacore.chapter22;

;
import java.net.*;
import java.io.*;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d == 0) {
            System.out.println("No data information.");
        } else {
            System.out.println("Data: " + new Date(d));
        }

        System.out.println("Content-Type: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("No expiration information");
        } else {
            System.out.println("Expires: " + new Date(d));
        }

        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("No last-modified information.");
        } else {
            System.out.println("Last-ModifiedL " + new Date(d));
        }

        long len = hpCon.getContentLength();
        if (len == -1) {
            System.out.println("Content length unavailable.");
        } else {
            System.out.println("Content-Length: " + len);
        }

        if (len != 0) {
            System.out.println("=== Content ===");
            InputStream input = hpCon.getInputStream();
            while(((c= input.read())!= -1)){
                System.out.print((char) c);
            }
            input.close();
        }else{
            System.out.println("No content available");
        }
    }
}
