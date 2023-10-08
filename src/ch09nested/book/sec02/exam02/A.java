package ch09nested.book.sec02.exam02;

public class A {
    static class B {
        int field1 = 1;
        static int field2 = 2;

        B() {
            System.out.println("B-생성자 실행");
        }

        void method1() {
            System.out.println("B.method1");
        }

        static void method2() {
            System.out.println("B.method2");
        }
    }

        static void useB(){
            B b = new B();
            System.out.println(b.field1);
            b.method1();

            System.out.println(B.field2);
            B.method2();
        }

    }

