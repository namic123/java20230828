package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C08read {
    public static void main(String[] args) {
        String file = "C:/Temp/out3.txt";
        int read;
        int read1;
        int read2;
        int read3;
        int read4;
        try (InputStream is = new FileInputStream(file)) {
            byte[] arr = new byte[3];

            // 3
            read = is.read(arr);
            // 3
            read1 = is.read(arr);
            // 3
            read2 = is.read(arr);
            // 1
            read3 = is.read(arr);
            // -1
            read4 = is.read(arr);
            System.out.println("read = " + read);
            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
