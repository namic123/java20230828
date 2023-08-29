package ch06class;

public class C09static {
}
class MyClass09{
    String name;        // instance field
    static String model;    // static field
    // instance method
    void printName(){

        // instance member끼리 접근 가능
        System.out.println("name = " + name);

        // instance member에서 static member 접근 가능
        System.out.println("model = " + model);
    }

    static void printModel(){
        // static member 끼리 접근 가능
        System.out.println("model = " + model);
        // System.out.println("name = " + name);   // 인스턴스 변수이므로 static 메서드에서 접근 불가
        // static member에서 instance member는 접근 불가능
    }
}