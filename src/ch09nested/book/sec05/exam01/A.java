package ch09nested.book.sec05.exam01;

public class A {
    int field;
    void method1(){}

    static int field2;
    static void method2(){}

    class B{
        void method(){
            field = 10;
            method1();

            field2 = 20;
            method2();
        }
    }
    static class C{
        void method(){
            field2 =10;
            method2();
        }
    }
}
