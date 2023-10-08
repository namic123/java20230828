package ch17stream.lecture;

import java.util.*;
import java.util.stream.Collectors;

public class C24grouping {
    public static void main(String[] args) {
        List<String>list = List.of(
                "java",
                "spring",
                "CSS",
                "html",
                "react",
                "vue",
                "jquery",
                "jsp"
        );
        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length));

        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}
