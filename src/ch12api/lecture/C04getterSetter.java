package ch12api.lecture;

public class C04getterSetter {
    public static void main(String[] args) {
        MyClass04 o1 = new MyClass04();
        o1.setName("박재성");
        System.out.println(o1.getName());
        o1.setAge(28);
        System.out.println(o1.getAge());
    }
}

class MyClass04{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
