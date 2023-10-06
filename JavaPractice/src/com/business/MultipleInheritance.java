package com.business;

interface GPS{
    String [] trackNetwork();
}
interface Camera{
    void takePicture();

    default void recordVideo(){
        //it is visible to all child classes
        System.out.println("Video recording has started!!");
    }
}

class CellPhone{
    public void call(long num){
        System.out.println("Calling to "+ num);
    }
}

class Phone extends CellPhone implements GPS, Camera{
    public String[] trackNetwork(){
        String [] args = {"airtel", "jio"};
        return args;
    }
    public void takePicture(){
        System.out.println("Photo is clicked!!");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Phone sp = new Phone();
        sp.call(8884616223l);
        String[] str =  sp.trackNetwork();
        for(String s : str){
            System.out.print(s + " ");
        }
        System.out.println();
        sp.takePicture();
        sp.recordVideo();
    }
}
