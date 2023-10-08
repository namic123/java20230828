package ch14thread.lecture;

public class C09join {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("t1 thread: "+(i+1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();

        // join : 다른 스레드의 종료를 기다림.
        t1.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread: "+(i+1));
            Thread.sleep(1000);
        }
    }
}
