package com.business;

abstract class Shape2{
    abstract public void area();

    public void method(){
        System.out.println("Non Abstract method!!");
    }
}

class Circle2 extends Shape2{
    private int radius = 3;

    public void area(){
        System.out.println("Area of circle is "+ Math.PI * (radius * radius));
    }
}

public class AbstractNonMethod {
    public static void main(String[] args) {
        Shape2 obj = new Circle2();
        obj.method();
        obj.area();
    }
}
