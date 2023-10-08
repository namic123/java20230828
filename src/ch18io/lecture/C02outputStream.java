package ch18io.lecture;

import java.io.*;

public class C02outputStream {
    public static void main(String[] args){
        // outputStream  : 바이트 단위 출력 스트림
        try {
            OutputStream os = new FileOutputStream("out.txt");
                os.write(65);
                os.write(71);
                os.write(73);
                os.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
