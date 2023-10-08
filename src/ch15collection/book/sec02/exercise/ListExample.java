package ch15collection.book.sec02.exercise;
import java.util.Collections;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }

        boolean contains = list.contains(new Board("제목1","내용1"));// false
        System.out.println("contains = " + contains+ ",");
        System.out.println(list.get(0).hashCode());
        System.out.println(new Board("제목1","내용1").hashCode());
    }
}
