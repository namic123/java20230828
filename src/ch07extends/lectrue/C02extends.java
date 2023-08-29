package ch07extends.lectrue;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();
        o1.name = "spring";
        o1.method3();
    }
}
class MySubClass021 extends MyClass02{

}

class MyClass02{
    String name;
    void method3(){}
}


