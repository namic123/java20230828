package ch07extends.lectrue;

public class C01extends {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.age = 33;
        o1.method();

        MySubClass011 o2 = new MySubClass011();
        o2.age = 44;
        o2.method();
    }
}

//
class MySubClass011 extends MyClass01{
}
class MyClass01{
    int age;
    void method(){
        System.out.println("MyClass01.method"); // soutm

    }
}