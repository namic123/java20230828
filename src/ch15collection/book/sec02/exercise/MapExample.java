package ch15collection.book.sec02.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry: entries){
            maxScore = Math.max(maxScore, entry.getValue());
           if(entry.getValue() == maxScore){ name = entry.getKey();}
            totalScore += entry.getValue();
        }
        System.out.println("최고점 이름:"+name+"높은 점수:"+maxScore + "종합 스코어:"+totalScore);

    }
}
