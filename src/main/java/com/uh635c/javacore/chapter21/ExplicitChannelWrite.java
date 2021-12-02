package main.java.com.uh635c.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("supportedFiles/nio_write.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE)){

            ByteBuffer mBuf = ByteBuffer.allocate(26);

            for(int i =0; i<26;i++){
                mBuf.put((byte) ('A'+i));
            }

            mBuf.rewind();

            fChan.write(mBuf);

        } catch(InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
            System.exit(1);
        }
    }
}
