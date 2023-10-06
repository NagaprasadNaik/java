package com.business;

class Smartphone{
    public void touchScreen(){
        System.out.println("Screen touched");
    }

    public void calculator(){
        //version 0.1
        System.out.println("Calculate expressions!!");
    }

    public void camera(){
        //version 0.1
        System.out.println("Photo clicked!!");
    }
}

class Redmi extends Smartphone{
    public void calculator(){
        //version 0.2
        System.out.println("Calculate scientific expressions!!");
    }

    public void camera(){
        //version 0.2
        System.out.println("Photo clicked with potrate mode!!");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Smartphone obj = new Redmi();
        obj.touchScreen();
        obj.calculator();
    }

}
