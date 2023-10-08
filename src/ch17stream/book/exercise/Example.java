package ch17stream.book.exercise;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
    List<Member> list = Arrays.asList(
            new Member("홍길동",30),
            new Member("신용권",40),
            new Member("감자바",26)
    );
    // 나이만 출력
    list.stream()
            .map(y->y.getAge())
            .forEach(System.out::println);

    // 나이 합
        System.out.println(
                list.stream()
                .map(Member::getAge)
                .reduce(0,Integer::sum)
        );

        // 가장 많은 나이 구해서 출력
        Integer maxNum =list.stream()
                .map(Member::getAge)
                .reduce(Integer.MIN_VALUE,Math::max);

        // 가장 적은 나이
        Integer minNum =list.stream()
                .map(Member::getAge)
                .reduce(Integer.MAX_VALUE,Math::min);
        System.out.println("최대 나이 :"+maxNum+"  최소 나이 :" +minNum);
}}
