package ch07extends.lecture;

public class C19polymorphism {
    public static void main(String[] args) {
    Hero19 myHero = new Hero19();
    myHero.weapon = new Gun();
    myHero.attack();

    myHero.weapon = new Sword();
    myHero.attack();
    }
}
class Hero19{
    public Weapon weapon;       // Weapon 클래스 타입 참조 변수

    public void attack(){
        weapon.shot();
    }
}

class Weapon{
    public void shot(){
        System.out.println("무기를 사용합니다.");
    }
}
class Gun extends Weapon{
        public void shot(){
            System.out.println("총을 씁니다.");
        }
}

class Sword extends Weapon{
    public void shot(){
        System.out.println("검을 휘두릅니다.");
    }
}