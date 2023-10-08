package ch09nested.lecture;

public class C10anonymous {
    public static void main(String[] args) {
         // 추상 클래스는 인스턴스 생성 불가능
        // MyClass10 o = new MyClass10();
        MyClass10 o1 = new MySubClass101();
        MyClass10 o2 = new MyClass10(){
            // 추상클래스로 익명 클래스를 만들 수 있음.
        };
    }
}
abstract class MyClass10{}
class MySubClass101 extends MyClass10{

}