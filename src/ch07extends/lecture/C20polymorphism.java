package ch07extends.lecture;

public class C20polymorphism {
    public static void main(String[] args) {

        Item item = getItem();

        item.printDesc();

        Item item1 = Exam.getItem();
        item.printDesc();

        Exam.getItem();

        System.out.println("게임 종료");
    }
    static Item getItem() {
        double d =Math.random();

        if(d< 0.5){
            return new Potion();
        }else{
            return new Map();
        }
    }

}
class Exam{
     static Item getItem() {      // Item 타입이므로, Item 자식 클래스 반환 가능
        double d =Math.random();

        if(d< 0.5){
            return new Potion();
        }else{
            return new Map();
        }
    }
}
class Item{
    public void printDesc(){
        System.out.println("아이템입니다.");
    }
}

class Potion extends Item{
    @Override
    public void printDesc() {
        System.out.println("체력을 채워줍니다.");
    }
}

class Map extends Item{
    @Override
    public void printDesc() {
        System.out.println("지도를 확장해줍니다.");
    }
}

