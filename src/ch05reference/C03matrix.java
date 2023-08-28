package ch05reference;
class Parent{
    void parentMethod(){}
}
public class C03matrix {
    Parent field = new Parent(){
        int childField;
        void childMethod(){}
        @Override
        void parentMethod(){
            childField=3;
            childMethod();
        }
    };

    void  method_cannot_use_anonymous(){
        field.parentMethod();
    }

    }
