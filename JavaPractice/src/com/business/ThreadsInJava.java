package com.business;

//Extending Thread class
//class Thread1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread 1 is running...");
//        }
//    }
//}
//
//class Thread2 extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread 2 is running...");
//        }
//    }
//}
//
//public class ThreadsInJava {
//    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//
//        t1.run();
//        t2.run();
//    }
//}

//Exteding Runnable interface
//class Thread1 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread 1 is running...");
//        }
//    }
//}
//
//class Thread2 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread 2 is running...");
//        }
//    }
//}
//
//public class ThreadsInJava {
//    public static void main(String[] args) {
//
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//
//        Thread obj = new Thread(t1);
//        Thread obj2 = new Thread(t2);
//
//
//        obj.start();
//        obj2.start();
//        System.out.println(obj.getPriority());
//    }
//}

//Life cycle of Threading
//new -> ready -> running -> waiting -> terminated  --> Process
//new -> runnable -> running -> non runnable -> terminated --> Thread


//Priorities in threads
//class Thread1 extends Thread {
//    public Thread1(String name){
//        super(name);
//    }
//
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread name is " + this.getName());
//        }
//    }
//}
//
//public class ThreadsInJava {
//    public static void main(String[] args) {
//        Thread1 t1 = new Thread1("Prasad");
//        Thread1 t2 = new Thread1("Sharanu");
//        Thread1 t3 = new Thread1("Vivek");
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.NORM_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}

//Methods of thread class -> join, sleep etc..
//class Thread1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread 1 is running... ");
//        }
//    }
//}
//
//class Thread2 extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread 2 is running...");
//        }
//    }
//}
//
//public class ThreadsInJava {
//    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//        t1.start();
//        try{
//            t1.join();
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
//        t2.start();
//    }
//}

//****************************************************************
//class Thread1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("Thread 1 is running... ");
//        }
//    }
//}
//
//class Thread2 extends Thread {
//    public void run() {
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("Thread 2 is running...");
//        }
//        try {
//            Thread.sleep(1);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}
//
//public class ThreadsInJava {
//    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//        t2.start();
//        t1.start();
//    }
//}