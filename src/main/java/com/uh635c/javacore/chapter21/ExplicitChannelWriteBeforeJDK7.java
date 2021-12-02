package main.java.com.uh635c.javacore.chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class ExplicitChannelWriteBeforeJDK7 {
    public static void main(String[] args) {
        FileOutputStream fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        try {

            fOut = new FileOutputStream("supportedFiles/nio_write_beforeJDK7.txt");

            fChan = fOut.getChannel();

            mBuf = ByteBuffer.allocate(26);

            for(int i=0; i<26; i++)
                mBuf.put((byte)('A' + i));

            mBuf.rewind();

            fChan.write(mBuf);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        } finally {
            try {
                if(fChan != null) fChan.close(); // close channel
            } catch(IOException e) {
                System.out.println("Error Closing Channel.");
            }
            try {
                if(fOut != null) fOut.close(); // close file
            } catch(IOException e) {
                System.out.println("Error Closing File.");
            }
        }
    }
}
