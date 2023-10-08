package ch17stream.lecture;

import java.util.List;

public class C12filter {
    public static void main(String[] args) {
        var list = List.of(3, 1, 4, 9, 10, 33, 2);

        list.stream()
                .sorted()
                .filter(e -> e % 2 == 0)   // 2의 배수만 필터링
                .forEach(System.out::println);      // 2, 4, 10

        System.out.println("짝수 중 가장 작은 값 출력");
        list.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("홀수 중 가장 큰 값 출력");
        list.stream()
                .sorted((x, y) -> y - x)
                .filter(i -> i % 2 == 1)
                .limit(1)
                .forEach(System.out::println);

    }
}
