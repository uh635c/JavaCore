package main.java.com.uh635c.javacore.chapter13;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
//        FileInputStream fin = null;

        //First, confirm that a filename has been specified.
        if (args.length != 1) {
            System.out.println("Usage: Showfile filename");
            return;
        }

        //The following code opens a file, read characters until EOF
        // is encountered, and then closes the file via a finally block
        try (FileInputStream fin = new FileInputStream(args[0])) {
//            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }finally{
//            //close file in all cases
//            try{
//                if(fin != null){
//                    fin.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Error Closing File");
//            }
        }
    }
}
