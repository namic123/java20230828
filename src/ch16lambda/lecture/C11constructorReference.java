package ch16lambda.lecture;

public class C11constructorReference {
    MyInterface111 o1 = z -> new MyClass11(z);  // 생성자 참조
    MyInterface111 o2 = MyClass11::new;     // 리팩토링
    MyInterface112 o3 = (x,y)-> new MyClass11(x,y);
    MyInterface112 o4 = MyClass11::new;
}

class MyClass11{
    MyClass11(int a) {}
    MyClass11(String a, int b){}
}

@FunctionalInterface
interface MyInterface111{
    MyClass11 method(int x);
}

interface MyInterface112{
    MyClass11 method(String x, int y);
}
