package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class ConcreteClass implements MyClass08.NestedInterface{
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }
    }
}

class MyClass081 implements MyClass08.NestedInterface{      // 다른 클래스에서 MyClass08 내부 인터페이스를 구현
    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}
class MyClass08{            // 클래스 안에 인터페이스를 만들 수 있다.
    interface NestedInterface{
        // 인터페이스에서 만들 수 있는 것
        // public final static field
        // public abstract instance method(*********88)
        void method2();      // 추상 ㅔㅁ서드

        // private instance method
        // default instance method
        // public static method
        // private static method
    }
    void method1(){
        // 메소드 안에 클래스 선언
        class ConcreteClass implements NestedInterface{
            @Override
            public void method2() {     // 메서드 오버라이드
                System.out.println("ConcreteClass.method2");
            }
        }
        // 인스턴스 생성
        ConcreteClass c = new ConcreteClass();
        c.method2();
    }
}