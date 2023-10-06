package com.business;

abstract class Shape{
    abstract public void size(int x, int y);
    abstract public void area();
}

class Circle extends Shape{
    private int radius = 3;
    private int width;
    private int height;

    public void size(int x, int y){
        this.width = x;
        this.height = y;
        System.out.println("Width is " + this.width + " Height is " + this.height);
    }

    public void area(){
        System.out.println("Area of circle is "+ Math.PI * (radius * radius));
    }
}

abstract class Reactangle extends Shape{
    public void rectangle(){
        System.out.println("This is a rectangle class!!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Circle obj = new Circle();
//        Reactangle r = new Reactangle(); //Abstract class : Cannot be instantiated
        Shape obj2 = new Circle(); //Abstract class : reference can be created
        obj.size(10, 20);
        obj.area();
        obj2.area();
    }
}
