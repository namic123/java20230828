package ch11exception.book.excercise.pg08;

public class Pg08 {
    public static void main(String[] args) {
        String[] strArray = {"10","2a"};
        int value = 0;
        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 초과");
            }catch (NumberFormatException e){           // 예외 발생
                System.out.println("숫자로 변환할 수 없음");
            }finally {
                System.out.println(value);      // 10
            }
        }

    }
}
