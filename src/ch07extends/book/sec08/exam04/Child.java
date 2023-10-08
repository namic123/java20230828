package ch07extends.book.sec08.exam04;

public class Child extends Parent{
    public int studentNo;

    public Child(String name, int studentNo){
        super(name);
        this.studentNo = studentNo;
    }
}
