package ch11exception.lecture;

public class C19throws {
    public static void main(String[] args)throws RuntimeException{
         method1();
        System.out.println("실행될까?");
    }

    public static void method1() throws RuntimeException {
        method2();
    }

    public static void method2() throws RuntimeException {
        throw new RuntimeException("예외 고의적으로 발생");
    }

}
