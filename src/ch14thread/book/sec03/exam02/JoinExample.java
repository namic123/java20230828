package ch14thread.book.sec03.exam02;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread =new SumThread();
        sumThread.start();
        try {

            sumThread.join();
        }catch (InterruptedException e){}
        System.out.println("1~100 합 : "+sumThread.getSum());
    }
}
