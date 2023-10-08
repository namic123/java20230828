package ch14thread.lecture;

import java.awt.*;

public class C07lamda {
    public static void main(String[] args) {
         new Thread(()-> {
            for (int i = 0; i < 3; i++) {
                System.out.println("띵");

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(()-> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 3; i++) {

                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

}
