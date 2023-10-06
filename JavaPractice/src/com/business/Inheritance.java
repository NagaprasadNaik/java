package com.business;

class Vehicle{
    long chessNo;
    int tyer;
    String color;


    public void setChessNo(long num ){
        this.chessNo = num;
    }
    public long getChessNo(){
        return this.chessNo;
    }
    public void setTyer(int tyer){
        this.tyer = tyer;
    }
    public int getTyer(){
        return this.tyer;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void getDetails(){
        System.out.println("Chess Number is " + this.chessNo);
        System.out.println("Color is " + this.color);
        System.out.println("Number of tyer is " + this.tyer);
    }
}

class Car extends Vehicle {

    public void steeringLeft(){
        System.out.println("Car is moving left side!!");
    }
    public void steeringRight(){
        System.out.println("Car is moving right side!!");
    }

}

class Bike extends Vehicle{

    public void handleLeft(){
        System.out.println("Bike is Turned to left!!");
    }
    public void handleRight(){
        System.out.println("Bike is Turned to right!!");
    }
 }

public class Inheritance {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setChessNo(120203040l);
        bmw.setColor("Black");
        bmw.setTyer(4);

        bmw.getDetails();
        bmw.steeringLeft();
        bmw.steeringRight();

        Bike bullet = new Bike();
        bullet.setChessNo(10203121212l);
        bullet.setColor("Blue");
        bullet.setTyer(2);
        bullet.getDetails();
        bullet.handleLeft();
        bullet.handleRight();
    }
}
