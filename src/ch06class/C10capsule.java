package ch06class;

public class C10capsule {

}
class MyClass10{

    //특별한 이유가 없다면
    // 필드는 private으로
    // 관련된 메서드(getter, setter)를 public으로 작성
    // 필드가 읽기 전용으로만 사용한다면 getter만 사용
    // 쓰기 전용으로만 하고 싶다면 setter만 사용한다.
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}