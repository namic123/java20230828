package ch09nested.book.sec03.exam02;

public class A {
    static class B{
        int field1 = 1;

        static int field2 = 2;
        B(){
            System.out.println("B.B");
        }
        void method1(){
            System.out.println("B-method1 실행");
        }

        static void method2(){
            System.out.println("B.method2");
        }
    }
}
