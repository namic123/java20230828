package ch14thread.lecture;

import java.awt.*;

public class C02thread {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            toolkit.beep();
        }
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("띵");
        }

    }
}