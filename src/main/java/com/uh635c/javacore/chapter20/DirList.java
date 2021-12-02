package main.java.com.uh635c.javacore.chapter20;

import java.io.*;

public class DirList {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\Esenin\\IdeaProjects\\JavaCore";
        File file = new File(dirname);

        if(file.isDirectory()){
            System.out.println("Directory of " + dirname);
            String[] s = file.list();

            for(int i = 0; i<s.length; i++){
                File f = new File(dirname + "/" + s[i]);
                if(f.isDirectory()){
                    System.out.println(s[i] + " is a directory");
                }else{
                    System.out.println(s[i] + " is a file");
                }
            }
        }else{
            System.out.println(dirname + " is not a directory");
        }
    }
}
