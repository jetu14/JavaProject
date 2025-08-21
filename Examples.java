package com.mycompany.examples;

public class Examples {
    
    static int count = 0;
    public static final double PI = 3.1416;
    
    public static void showInfo(){
        System.out.println("Count = " +count);
    }

    public static void main(String[] args) {
        System.out.println(Examples.count);;
        Examples.showInfo();
        System.out.println("PI = " +Examples.PI);
    }
}
