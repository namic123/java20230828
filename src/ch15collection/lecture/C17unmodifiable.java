package ch15collection.lecture;

import java.util.Set;

public class C17unmodifiable {
    public static void main(String[] args) {
        Set<String> set = Set.of("a","b","c");
        System.out.println("set = " + set);
        // set.add("d")
    }
}
