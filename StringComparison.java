package com.mycompany.stringcomparison;

public class StringComparison {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        
        System.out.println("Equals : " +s1.equals(s2));
        System.out.println("Equals Ignor case : " +s1.equalsIgnoreCase(s2));
        System.out.println("Compare to : " +s1.compareTo(s2));
    }
}
