package ThreadTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import javax.sound.midi.VoiceStatus;



public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
     //   FileReadTest();
     //   FileInputStreamTest();
     //   FileWrite(); 
        PrintStreamTest();
    }
    public static void FileInputStreamTest() throws IOException {
        FileInputStream fiStream = new FileInputStream("/home/hanshizhe/workspace/JavaTest/src/ThreadTest/FileInputStreamTest.java");
        FileOutputStream fileOutputStream = new FileOutputStream("/home/hanshizhe/workspace/JavaTest/src/hanshizhe.txt");
        byte[] buf = new byte[1024];
        int hasRead = 0;
        while ((hasRead = fiStream.read(buf))>0) {
            System.out.print(new String(buf,0, hasRead));
            fileOutputStream.write(buf,0,hasRead);
            
        }
        fiStream.close();
        fileOutputStream.close();
    }
    public static void FileReadTest() {
        try {
            FileReader fReader= new FileReader("/home/hanshizhe/workspace/JavaTest/src/ThreadTest/FileInputStreamTest.java");
            char [] buf = new char[32];
            int hasRead = 0;
            while ((hasRead = fReader.read(buf)) > 0) {
                System.out.print(new String(buf,0, hasRead));
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void FileWrite () {
        try {
            FileWriter fWriter = new FileWriter("/home/hanshizhe/workspace/JavaTest/src/ThreadTest/tangshi.txt");
            fWriter.write("韩仕喆\r\n");
            fWriter.write("韩仕喆\r\n");
            fWriter.write("韩仕喆\r\n");
            fWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void PrintStreamTest() {
        try {
            FileOutputStream fOutputStream = new FileOutputStream("/home/hanshizhe/workspace/JavaTest/src/ThreadTest/tangshi1.txt");
            PrintStream ps = new PrintStream(fOutputStream);
            ps.println("大唐终端技术有限公司");
            ps.println(new FileInputStreamTest());
            ps.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
