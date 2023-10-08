package ch15collection.lecture;

import java.util.Map;

public class C18unmodifiable {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("1","a","2","b","3","c");
        System.out.println("map = " + map);
    }
}
