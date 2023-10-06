package com.business;

import java.util.Scanner;

//public class Exception {
//    public static void main(String[] args) {
//        int num1;
//        int num2;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num1");
//        num1 = sc.nextInt();
//        System.out.println("Enter the num2");
//        num2 = sc.nextInt();
//
//        try{
//            System.out.println("Num1 / Num2 = " + (num1/num2));
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }catch (ArrayIndexOutOfBoundsException e ){
//            System.out.println(e);
//        }
//    }
//}


//Nested try catch block
//public class Exception {
//    public static void main(String[] args) {
//        int num1;
//        int num2;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num1");
//        num1 = sc.nextInt();
//        System.out.println("Enter the num2");
//        num2 = sc.nextInt();
//
//        try{
//            System.out.println("Num1 / Num2 = " + (num1%num2));
//            try{
//                System.out.println("Num1 / Num2 = " + (num1/num2));
//            }catch (ArithmeticException e){
//                System.out.println(e);
//            }
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }
//    }
//}


//Custom Exception Using Exception Class
//public class Exception extends java.lang.Exception {
//    @Override
//    public String toString(){
//        return "custom exception";
//    }
//
//    public String getMessage(){
//        return "Invoked when explicitly called!!";
//    }
//
//    public static void main(String[] args) {
//        int num1;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num1");
//        num1 = sc.nextInt();
//
//        if(num1 < 10){
//            try{
//                throw new Exception();
//            }catch (Exception e){
//                System.out.println(e);
//                System.out.println(e.toString());
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}


//The throws keyword
//public class Exception {
//    public static void calculate(int a, int b) throws java.lang.Exception {
//        System.out.println(a / b);
//    }
//
//    public static void main(String[] args) {
//        int num1;
//        int num2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num1");
//        num1 = sc.nextInt();
//        System.out.println("Enter the num2");
//        num2 = sc.nextInt();
//
//        try{
//            calculate(num1, num2);
//        }catch (java.lang.Exception e){
//            System.out.println(e);
//        }
//
//    }
//}

