package com.business;

// StringBuffer is thread-safe and synchronized whereas StringBuilder is not.
// That's why StringBuilder is faster than StringBuffer.

public class MutableString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

//        System.out.println(sb.charAt(0));

//        sb.setCharAt(0, 'G');
//        System.out.println(sb);

//        sb.insert(0, "New");
//        System.out.println(sb.charAt(0));
//        System.out.println(sb);

//        sb.delete(0, 1);
//        System.out.println(sb);

//        sb.append("New");
//        System.out.println(sb);

//        Reverse a string
//        for (int i=0; i<sb.length()/2; i++){
//            int front = i;
//            int back = sb.length()-1-i;
//
//            char frontChar = sb.charAt(front);
//            char backChar = sb.charAt(back);
//
//            sb.setCharAt(front, backChar);
//            sb.setCharAt(back, frontChar);
//        }
//
//        System.out.println("Reversed String is " + sb);
    }
}
