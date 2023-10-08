package ch09nested.book.sec02.exam01;

public class A {
    // 인스턴스 멤버 클래
    class B{}

    //인스턴스 필드 값으로 B객체 대입
    B field = new B();

    //생성자
    A(){
        B b = new B();
    }
    void Method(){
        B b = new B();
    }
}
