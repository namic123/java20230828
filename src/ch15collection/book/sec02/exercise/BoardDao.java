package ch15collection.book.sec02.exercise;

import java.util.ArrayList;
import java.util.List;

public class BoardDao{
    public List<Board> getBoardList(){
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1","내옹1"));
        list.add(new Board("제목2","내옹2"));
        list.add(new Board("제목3","내옹3"));
        return list;
    }
}
