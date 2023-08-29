package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();

        o1.age=30;
        o1.model = "java";
        System.out.println(o1.age);
    
        System.out.println("System.identityHashCode(o1) = " + System.identityHashCode(o1));
        System.out.println("o2.age = " + o2.age);
        System.out.println("o1.model = " + o1.model);
        System.out.println("o2.model = " + o2.model);
    }
}

class MyClass05{
    int age;    // instance field
    
    // static field, class field, 정적 필드
    static String model;    //static field
}