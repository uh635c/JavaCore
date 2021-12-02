package main.java.com.uh635c.javacore.chapter21;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream fout = Files.newOutputStream(Paths.get("supportedFiles/test.txt"), StandardOpenOption.APPEND)) {
            for (int i = 0; i < 26; i++) {
                fout.write('A' + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch(InvalidPathException e) {
            System.out.println("Path Error " + e);
        }
    }
}
