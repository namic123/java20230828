package ch07extends.lecture;

public class C08super {
    public static void main(String[] args) {
        MySubClass081 o1 = new MySubClass081();
        o1.method();
    }
}
class MyClass08{
    void method(){
        System.out.println("부모의 메서드!");
    }
}

class MySubClass081 extends MyClass08{
    void method(){
        System.out.println("자식 메서드!");
        super.method();
    }
}