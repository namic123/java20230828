package ch07extends.book.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        if (wifi == true) System.out.println("와이파이 켜짐");
        else System.out.println("와이파이 꺼짐");
    }

    public void internet() {
        System.out.println("인터넷을 연결");
    }
}
