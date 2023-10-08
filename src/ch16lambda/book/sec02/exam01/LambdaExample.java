package ch16lambda.book.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(()-> {
            System.out.println("출근을 한다");
            System.out.println("프로그래밍을 한다.");
        });

        person.action(()-> System.out.println("퇴근을 한다."));
    }
}
