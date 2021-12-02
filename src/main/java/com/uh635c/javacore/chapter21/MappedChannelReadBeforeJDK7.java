package main.java.com.uh635c.javacore.chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class MappedChannelReadBeforeJDK7 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;

        try{
            fIn = new FileInputStream("supportedFiles/test.txt");
            fChan = fIn.getChannel();
            fSize = fChan.size();
            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);

            for(int i = 0 ; i<fSize; i++){
                System.out.print((char) mBuf.get());
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        } finally {
            try {
                if(fChan != null) {
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
