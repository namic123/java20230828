package ch11exception.lecture;

public class C05printStrackTrace {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        try {
            int i = 0;
            int j = 3 / i;  // 예외 발생.
        } catch (ArithmeticException e) {
            e.printStackTrace();    // 호출된 메소드
            System.out.println("예외 메세지 : "+e.getMessage());     // by zero 출력
        }
    }
}
