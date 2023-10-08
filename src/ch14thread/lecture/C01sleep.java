package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) {
        System.out.println("code1");
        try {
            Thread.sleep(1000);
            System.out.println("code2");
            Thread.sleep(1000);
            System.out.println("code3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
