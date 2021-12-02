package main.java.com.uh635c.javacore.chapter20;

import java.io.*;

public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class DirListOnly {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\Esenin\\IdeaProjects\\JavaCore";
        File fl = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");
        String s[] = fl.list(only);

        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}
