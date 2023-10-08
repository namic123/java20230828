package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {
        var list = List.of(2, 2, 1, 3, 3, 4, 5, 5);
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);  // 1, 2, 3, 4, 5
    }
}
