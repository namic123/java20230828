package ch14thread.lecture;

import java.awt.*;

public class C04thread {
    public static void main(String[] args) {
       // 스레드 만들기
        Thread thread = new MyThread();
        // 스레드 시작
        thread.start();

        Thread thread1 = new YourThread();
        thread1.start();
    }


}

class YourThread extends Thread{
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        // thread가 해야할 일 작성
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
