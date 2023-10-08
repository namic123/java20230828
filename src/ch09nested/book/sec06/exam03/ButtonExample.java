package ch09nested.book.sec06.exam03;

import ch07extends.book.exercise.p12.B;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        // OkListener는 Button클래스 내부 ClickListener를 구현했기 때문에 할당 가능
        btnOk.setClickListener(new OkListener());


        btnOk.click();

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭");
            }
        }
        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();
    }
}
