package ch18io.book.sec02.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws RuntimeException {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test.db");
            byte[] array = {10,20,30,40,50};
            os.write(array, 1, 3);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
