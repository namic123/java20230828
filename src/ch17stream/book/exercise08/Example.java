package ch17stream.book.exercise08;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(s -> s.getJob()));

        System.out.println(groupingMap.get("개발자"));
        System.out.println(groupingMap.get("디자이너"));

//        System.out.println("디자이너");
//        list.stream()
//                .filter(m -> m.getJob().equals("디자이너"))
//                .toList()
//                .forEach(System.out::println);
//    }
    }
}
