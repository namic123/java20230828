package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    OutputStream os = null;
    public void method1(){
        try {
            OutputStream os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                os.close(); // io stream을 꼭 닫아야함.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void method2(){
        //try-with-resources 문법
        // 변수의 타입은 Auto Closeable이어야 함.
        try(OutputStream os = new FileOutputStream("");) {
        os.write(33);
        os.write(67);
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void method3(){
        try(
                FileOutputStream fos = new FileOutputStream("");
            FileInputStream fis = new FileInputStream("");
        ){
            fos.write(234);
            fos.close();
        fis.read();
        fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void method4(){
        Scanner scanner = new Scanner("");
        try (scanner){
            scanner.hasNext();
            scanner.next();
        }
    }
    public void method5(){
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");
            try(fio;fos;){
                fio.read();
                fos.write(33);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        }
    public void method6() throws IOException {
        // 안좋은 코드임...
        // close() 전에 예외가 발생하면 닫을 수 없기 때문에 안좋은 코드임

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();
    }
}
