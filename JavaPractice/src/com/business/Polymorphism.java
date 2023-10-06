package com.business;

////COMPILE TIME POLYMORPHISM
//class ParentClass {
//    public void method(){
//        System.out.println("Parent class method!!");
//    }
//    public void method(String args){
//        System.out.println("Parent class "+ args + " method!! ");
//    }
//}
//class ChildClass1 extends ParentClass{
//    public void method(){
//        System.out.println("1 Child class method");
//    }
//}
//
//
//public class Polymorphism {
//    public static void main(String[] args) {
//        ParentClass obj = new ChildClass1();
//        obj.method();
//        obj.method("overloded");
//
//    }
//}

//RUNTIME POLYMORPHISM
//class ParentClass {
//    public void method(){
//        System.out.println("Parent class method!!");
//    }
//}
//class ChildClass1 extends ParentClass{
//    public void method(){
//        System.out.println("1 Child class method");
//    }
//}
//class ChildClass2 extends ParentClass{
//    public void method(){
//        System.out.println("2 Child class method");
//    }
//}
//
//public class Polymorphism {
//    public static void main(String[] args) {
//        ParentClass obj;
//
//        obj = new ChildClass1();
//        obj.method();
//
//        obj = new ChildClass2();
//        obj.method();
//    }
//}
