package com.business;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = s.nextInt();
        System.out.println("Enter number 2");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of num1 and num2 is " + sum);

    }
}
