package ch17stream.lecture;

import java.util.List;

public class C07distinct{
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 2, 1, 3);
        list.stream()
                .distinct()
                .forEach(System.out::println);  // 3, 1, 2 (중복 제거됨)
    }
}
