package com.business;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Open a file or connection!!");
        }catch (Exception e){
            System.out.println("Handle exception!!");
        }finally{
            System.out.println("Close file or all connection!!");
        }
    }
}
