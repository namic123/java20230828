package ch09nested.lecture;

public class C04access {
    // static 멤버는 인스턴스 멤버에 접근할 수 없다.

    int instanceField;
    static int staticField;

    static class StaticNestedClass{
        void method1(){
            System.out.println(staticField);
//            System.out.println(instanceField);
        }
    }

    class InnerClass{
        void method(){
            System.out.println(instanceField);
            System.out.println(staticField);
        }
    }
}
