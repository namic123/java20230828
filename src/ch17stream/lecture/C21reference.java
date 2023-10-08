package ch17stream.lecture;
import java.util.*;
public class C21reference {
    public static void main(String[] args) {
        List<String> list1 = List.of("java", "spring", "css");
        Integer length1 = list1.stream()
                .map(String::length)
                .reduce(Integer::sum)
                .get();
                                                        
        // 참조 타입 stream -> 기본타입 stream
        Integer sum = list1.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("sum = " + sum);
    }
}
