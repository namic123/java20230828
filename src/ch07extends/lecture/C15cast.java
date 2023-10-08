package ch07extends.lecture;

public class C15cast {
    public static void main(String[] args) {
        // 상속 강제 형변환 (다운캐스트가 위험한 이유)

        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15();

        Dog15 d1 = (Dog15) ani1;    // 가능
        Cat15 c1 = (Cat15)  ani2;   // 가능

//    Cat15 c2 = (Cat15) ani1;    // 안된다., 강제 형변환을 했으므로 문법 오류는 아님.
//    Dog15 d2 = (Dog15) ani2; // 마찬가지

        Animal15 ani3 = new Animal15();
//    Dog15 d3 = (Dog15) ani3;  // 안된다.
//        Dog15 dogEx = (Dog15) new Animal15();

    }

}
class Animal15{}
class Dog15 extends Animal15{}
class Cat15 extends Animal15{}