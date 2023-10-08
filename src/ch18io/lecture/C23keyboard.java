package ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23keyboard {
    public static void main(String[] args) {
        try {
            InputStream keyboard = System.in;
            InputStreamReader isr = new InputStreamReader(keyboard);
            BufferedReader br = new BufferedReader(isr);

//        BufferedReader br1 = new BufferedReader(new InputStreamReader(keyboard));
            try (br; isr;) {
                String line = br.readLine();
                System.out.println(line);

                line = br.readLine();
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
