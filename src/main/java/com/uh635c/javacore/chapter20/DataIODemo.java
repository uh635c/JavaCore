package main.java.com.uh635c.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeBoolean(true);
            dout.writeInt(100);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("test.dat"))){
            double d = din.readDouble();
            boolean b = din.readBoolean();
            int i = din.readInt();

            System.out.println("Here are the values: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Input File");
            return;
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
