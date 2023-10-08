package ch17stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        var list = List.of(3,1,2,5,7);

        list.stream()
                .map(x->10)     // x는 매개변수 10은 리턴값
                .forEach(System.out::println);  // 10, 10, 10, 10, 10

        System.out.println("음수로 바꿔서 출력");
        list.stream()
                .map(x-> -x)        // -x 리턴
                .forEach(System.out::println);  // -3. -1. -2, -5, -7

        System.out.println("두배한 값으로 출력");
        list.stream()
                .map(x->x*2)       // x*2 리턴
                .forEach(System.out::println);  // 6,2,4,10,14

        System.out.println("제곱값 출력");
        list.stream()
                .map(x->x*x)      // x의 제곱 리턴
                .forEach(System.out::println);  // 9, 1, 4, 25, 49

    }
}
