package ch18io.lecture;

import java.io.*;

public class C13writer {
    public static void main(String[] args) {
        // outputstream과 비교
        String file = "C:/Temp/out5.txt";
        String file2 = "C:/Temp/out6.txt";

        try (OutputStream os = new FileOutputStream(file);Writer writer = new FileWriter(file2);) {

            try(os;writer){
                os.write(65);
                writer.write(65);

                os.write(127);
                writer.write(127);

                os.flush();
                writer.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
