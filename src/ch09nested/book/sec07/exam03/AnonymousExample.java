package ch09nested.book.sec07.exam03;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.run();
        anony.method1();
        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달린다.");
            }
        });

        Vehicle anony_ramda = ()-> System.out.println("기차가 달린다.");
        anony_ramda.run();
        anony.method2(()-> System.out.println("비행기가 난다."));
    }
}
