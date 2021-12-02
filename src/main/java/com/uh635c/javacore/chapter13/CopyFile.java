package main.java.com.uh635c.javacore.chapter13;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        int i;
//        FileInputStream fin = null;
//        FileOutputStream fout = null;

        //First, confirm that both filenames have been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        //Copy a File.
        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
            //Attempt to open the files.
//            fin = new FileInputStream(args[0]);
//            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }finally{
//            try{
//                if(fin!=null){
//                    fin.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Error Closing Input File");
//            }
//            try{
//                if(fout!=null){
//                    fout.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Error Closing Output File");
//            }
        }
    }
}
