package com.business;


interface Ancestor {
    void test();
}
interface ParentInterface{
    void method1();
}

interface ChildInterface extends ParentInterface , Ancestor{
    void method2();
}

public class InterfaceInheritance implements ChildInterface{

    public void test(){
        System.out.println("Ancestor Method");
    }
    public void method1(){
        System.out.println("Method 1");
    }

    public void method2(){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        InterfaceInheritance obj = new InterfaceInheritance();
        obj.test();
        obj.method1();
        obj.method2();
    }
}
