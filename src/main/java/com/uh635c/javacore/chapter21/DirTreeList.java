package main.java.com.uh635c.javacore.chapter21;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

public class DirTreeList {
    public static void main(String args[]) {
        String dirname = "supportedFiles";
        System.out.println("Directory tree starting with " + dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("I/O Error");
        }
    }
}
