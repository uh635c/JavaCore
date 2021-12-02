package main.java.com.uh635c.javacore.chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class ExplicitChannelReadBeforeJDK7 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;

        try{
            fIn = new FileInputStream("supportedFiles/test.txt");
            fChan = fIn.getChannel();
            mBuf = ByteBuffer.allocate(128);

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
        } finally {
            try {
                if(fChan != null){
                    fChan.close(); // close channel
                }
            } catch(IOException e) {
                System.out.println("Error Closing Channel.");
            }
            try {
                if(fIn != null) {
                    fIn.close(); // close file
                }
            } catch(IOException e) {
                System.out.println("Error Closing File.");
            }
        }
    }
}
