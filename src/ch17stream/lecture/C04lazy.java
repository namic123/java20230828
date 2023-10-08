package ch17stream.lecture;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class C04lazy {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","a","s");
        long count = list.stream()
                .filter( x-> x.equals("a"))
                .count();  // a = 2

        System.out.println(count);
    }
}
