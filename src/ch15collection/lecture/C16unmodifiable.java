package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C16unmodifiable {
    public static void main(String[] args) {
        List<String>list = new ArrayList();
        list.add("java");
        list.add("Spring");
        list.add("html");

        list.remove(1);

        //수정 불가 리스트
        List<String> list2=List.of("java","react","css");
//        list2.add("vue"); 수정 불가
//        list2.remove(1);  수정 불가
    }
}
