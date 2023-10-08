package ch09nested.book.sec07.exam03;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("ActionExample.work");
            }
        };
        action.work();

        Action action2 = ()-> System.out.println("복사를한다.");
        action2.work();
    }
}
