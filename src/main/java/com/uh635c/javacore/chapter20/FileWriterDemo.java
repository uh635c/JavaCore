package main.java.com.uh635c.javacore.chapter20;

import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";

        char buf[] = new char[source.length()];
        source.getChars(0, source.length(), buf, 0);


        try (FileWriter f0 = new FileWriter("file11.txt", true);
             FileWriter f1 = new FileWriter("file22.txt");
             FileWriter f2 = new FileWriter("file33.txt");) {

            //write to first file
            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }

            //write to second file
            f1.write(buf);

            //write to third file
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");

        }
    }
}