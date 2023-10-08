package ch17stream.lecture;

import java.util.*;

public class C06forEach {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,4,5,6,7,10);
           list.stream()
                   .forEach(System.out::println);
    }
}
