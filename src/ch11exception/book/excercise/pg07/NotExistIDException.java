package ch11exception.book.excercise.pg07;

public class NotExistIDException extends  Exception {
    public NotExistIDException(){}
    public NotExistIDException(String msg){
        super(msg);
    }
}
