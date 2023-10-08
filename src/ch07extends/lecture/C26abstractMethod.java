package ch07extends.lecture;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath();

        Animal26 a2 = new Fish26();
        a2.breath();
    }
}
abstract class Animal26{
    // 추상 메서드 : 몸통이 없는 메서드
   abstract public void breath();
}


class Dog26 extends Animal26{
    public void breath(){
        System.out.println("폐로 숨쉰다.");
    }
}

class Fish26 extends Animal26{
    public void breath(){
        System.out.println("아가미 숨쉰다.");
    }
}