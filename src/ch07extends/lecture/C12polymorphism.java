package ch07extends.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        Malamute12 dog = new Malamute12();
        dog.breath();
        dog.sniff();

        Animal12 ani = dog;
        ani.breath();

        Animal12 ani2 = new Malamute12();
        ani2.breath();

    }
}

class Animal12{
    public void breath(){
        System.out.println("숨쉬다");
    }
}

class Malamute12 extends Animal12{
    public void sniff(){
        System.out.println("냄새를 맡다");
    }
}