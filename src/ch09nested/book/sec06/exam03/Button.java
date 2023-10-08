package ch09nested.book.sec06.exam03;

public class Button {
    static interface ClickListener{
        void onClick();
    }

    private ClickListener clickListener;

    // setClickListener를 통해 clickListener에 값 할당 가능
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}
