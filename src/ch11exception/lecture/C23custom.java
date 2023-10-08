package ch11exception.lecture;

public class C23custom {
    public static void main(String[] args) {
       throw new customException("사용자 정의 예외 발생");
    }
}

class customException extends RuntimeException {   // 사용자 정의 예외 RuntimeException 상속
    public customException() {     //  기본 생성자
    }
    public customException(String message) {
        super(message);
    }
}
