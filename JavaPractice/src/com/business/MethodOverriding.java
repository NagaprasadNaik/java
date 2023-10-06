package com.business;

class Base {
    public void method(){
        System.out.println("Base class method!!");
    }
}

class Derived extends Base{
    public void method(){
//        super.method(); //used to call base class method
        System.out.println("Derived class method!!");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.method();
    }
}
