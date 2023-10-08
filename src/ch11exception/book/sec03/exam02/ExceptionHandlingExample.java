package ch11exception.book.sec03.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100","1oo"};
        for (int i = 0; i <= array.length; i++) {
            try{
            int value = Integer.parseInt(array[i]);
            System.out.println("array["+i+"]: "+value);
         }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스 초과 " + e.getMessage());
            }catch (Exception e){
                System.out.println("실행 중 문제가 발생");
            }
        }
    }
}
