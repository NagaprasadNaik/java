package com.business;

class Workers {
    int id;
    int salary;
    String name;

//    Default Constructors
    public Workers(){
        this.id = 1;
        this.salary = 1000;
        this.name = "Prasad";
    }

//    Parametrized Comnstructors
    public Workers(int id, int salary, String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

//    Copy Constructor
    public Workers(Workers obj){
        this.id = obj.id;
        this.salary = obj.salary;
        this.name = obj.name;
    }

    public void getDetails(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Workers obj1 = new Workers();
        Workers obj2 = new Workers(2, 2000, "Sharanu");
        Workers obj3 = new Workers(obj1);

        obj1.getDetails();
        obj2.getDetails();
        obj3.getDetails();
    }
}
