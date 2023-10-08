package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class C22collect {
    public static void main(String[] args) {
        List<String> list = List.of("java","css","spring","html");
        
        List<Integer> res1 = new ArrayList<>();
        for(String str: list){
            res1.add(str.length());
        }
        System.out.println("res1 = " + res1);

        //Collect는 모으는 메서드, Collectors 는 컬렉션 형태로 만들어주는 클래스

        //List로 변환
        List<Integer> res2 =list.stream()
                .map(String::length)
                .collect(toList());

        // Set으로 변환
        Set<Integer> res3 =list.stream()
                .map(String::length)
                .collect(toSet());

        // Map으로 변환
        Map<String,Integer> res4 = list.stream()
                .collect(toMap(x->x,String::length));
        // Function.identity 는 위 x->x 랑 동일함.
        list.stream()
                .collect(toMap(Function.identity(),String::length));

    }
}
