package ch16lambda.book.sec05.exam03;


public class Member{
    private String id;
    private String name;

    public Member(String id) {
        this.id = id;
        System.out.println("Member(String id)");
    }
    public Member(String id, String name) {
        this.name = name;
        this.id = id;
        System.out.println("Member(String id, String name)");
    }

    @Override
    public String toString() {
        String info = "{ id:"+ id + ", name;" +name + "}";
        return info;
    }
}
@FunctionalInterface
interface Creatable1 {
    public Member create(String id);
}
@FunctionalInterface
interface Creatable2{
    public Member create(String id, String name);
}
