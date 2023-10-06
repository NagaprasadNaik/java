package com.business;


public class StringPractice {
    public static void main(String[] args) {
//        String str = new String("Prasad");
//        System.out.println(str);

        String str = "Prasad";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(3));
        System.out.println(str.substring(0, 3));
        System.out.println(str.replace("sad", "mad"));
        System.out.println(str.startsWith("P"));
        System.out.println(str.endsWith("d"));
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("sad"));
        System.out.println(str.indexOf("s", 3));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.equals("prasad"));
        System.out.println(str.equalsIgnoreCase("prasad"));

    }

}
