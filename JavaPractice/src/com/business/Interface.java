package com.business;

interface Bicycle {
//    int speed = 5; //cannot be modified as they are final
    void applyBreak(int increment);
    void speedUp(int decrement);
}

interface HornBicycle{
    void hornBicycle();
}

class AvonBicycle implements Bicycle, HornBicycle{
    int speed = 5;

    public void applyBreak(int i){
        this.speed = this.speed - i;
    }

    public void speedUp(int i){
        this.speed = this.speed + i;
    }

    public void hornBicycle(){
        System.out.println("Keeeeeeeeeeeeeeeeeeeeeeee..........");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonBicycle ab = new AvonBicycle();
        ab.applyBreak(2);
        System.out.println(ab.speed);
        ab.speedUp(2);
        System.out.println(ab.speed);
        ab.hornBicycle();

    }
}
