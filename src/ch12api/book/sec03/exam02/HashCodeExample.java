package ch12api.book.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 =new Student(1, "홍길동");
        Student s2 =new Student(1, "홍길동");

        if(s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("동등 객체");
            } else {
                System.out.println("데이터 및 동등 객체 아님");
            }
        } else{
            System.out.println("해시코드 및 동등 객체가 아님");
        }
    }
}
