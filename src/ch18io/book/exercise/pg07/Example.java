package ch18io.book.exercise.pg07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        String filePath="src/ch18io/book/exercise/pg07/Example.java";
        try {
        FileReader fr= new FileReader(filePath);
        BufferedReader br= new BufferedReader(fr);

        try(fr;br;) {
            int rowNumber = 0;
            String rowData;
            while (true) {
                rowData = br.readLine();
                rowNumber++;
                if(rowData == null) break;
                System.out.println(rowNumber+": "+rowData);
            }
        }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
