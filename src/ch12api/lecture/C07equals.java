package ch12api.lecture;

public class C07equals {
    public static void main(String[] args) {
        MyClass07 o1 =new MyClass07("박지성");
        MyClass07 o2 =new MyClass07("박지성");

        System.out.println(o1==o2);
        System.out.println(o1.equals(o2));
    }

}
class MyClass07{
    private String name;

    public MyClass07(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        MyClass07 o =(MyClass07) obj;
        return this.name.equals(o.name);
    }
}
