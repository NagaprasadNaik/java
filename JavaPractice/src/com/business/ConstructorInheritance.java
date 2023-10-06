package com.business;

//class Perent {
//    public Perent(){
//        System.out.println("Default Constructor of Perent class");
//    }
//
//    public Perent (String args){
//        System.out.println(args + " Constructor of Perent class");
//    }
//}
//
//class Child extends Perent {
//    public Child(){
//        System.out.println("Default Constructor of Child class");
//    }
//
//}
//
//public class ConstructorInheritance {
//    public static void main(String[] args) {
//        Child ch = new Child();
//    }
//}

//Overloaded constructor inheritance
class Parent {

    public Parent(){
        System.out.println("Default Constructor of Perent class");
    }

    public Parent (String args){
        System.out.println(args + " Constructor of Perent class");
    }
}

class Child extends Parent {
    public Child(){
        super("parameterised");//must be first statement in constructor
        System.out.println("Default Constructor of Child class");
    }

}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Child ch = new Child();
    }
}