package ch11exception.lecture;

public class C20polymorphism {
    public static void main(String[] args) throws Exception { // 상위 타입으로 throws 가능
        method1();
    }
    public static void method1() throws ClassNotFoundException{
        method2();
    }
    public static void method2()throws ClassNotFoundException {

    }
}
