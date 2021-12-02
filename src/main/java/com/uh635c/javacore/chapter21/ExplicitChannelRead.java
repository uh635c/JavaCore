package main.java.com.uh635c.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath;

        try {
            filepath = Paths.get("supportedFiles\\test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
            return;
        }

        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
            ByteBuffer mBuf = ByteBuffer.allocate(10);

            do {
                count = fChan.read(mBuf);

                if (count != -1) {
                    mBuf.rewind();

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
