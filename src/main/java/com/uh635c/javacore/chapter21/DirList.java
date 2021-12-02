package main.java.com.uh635c.javacore.chapter21;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class DirList {
    public static void main(String[] args) {
        String dirname = "supportedFiles";

        // Obyain and manage s directory stream within a try block
        try(DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Directory of " + dirname);

            for(Path entry : dirstrm){
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);
                if(attribs.isDirectory()){
                    System.out.print("<DIR> ");
                }else{
                    System.out.print("      ");
                }
                System.out.println(entry.getName(1));
            }
        } catch(InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch(NotDirectoryException e) {
            System.out.println(dirname + " is not a directory.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
