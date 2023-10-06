package com.business;

class Employee {
    int id;
    private int salary;
    String name;

//    Getters and setters
    public void setSalary(int s){
        this.salary = s;
    }
    public int getSalary(){
        return salary;
    }

    public void getDetails(){
        System.out.println("Id : "+this.id);
        System.out.println("Id : "+this.salary);
        System.out.println("Id : "+this.name);
    }
}
public class OOPs {
    public static void main(String[] args) {
        Employee obj1 = new Employee(); //Instantiation
        Employee obj2 = new Employee(); //Instantiation

        obj1.id = 10;
        obj1.setSalary(10000);
        obj1.name = "Prasad";

        obj2.id = 20;
        obj2.setSalary(20000);
        obj2.name = "Sharanu";

        System.out.println(obj1.getSalary());
        obj1.getDetails();

        System.out.println(obj2.getSalary());
        obj2.getDetails();
    }
}
