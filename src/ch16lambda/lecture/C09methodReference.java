package ch16lambda.lecture;

public class C09methodReference {
    public static void main(String[] args) {
        MyInterface09 o1 = (x, y) -> {};
        MyInterface09 o2 = (x, y) -> x.someMethod(y);
        MyInterface09 o3 = MyClass09::someMethod;

        o2.method(new MyClass09(), 1);
        o3.method(new MyClass09(), 2);
    }
}

class MyClass09 {
    void someMethod(int a) {
        System.out.println(a);
    }
}

interface MyInterface09 {
    void method(MyClass09 x, int y);
}