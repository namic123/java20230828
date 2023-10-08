package ch07extends.lecture;

public class C24constructor {
}

class MyClass24{
    int age;

    MyClass24(){}
    MyClass24(int age){
        this.age = age;
    }
}

class MySubClass24 extends MyClass24{
    MySubClass24(){
        super(30);
    }

}
