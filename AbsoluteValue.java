package com.mycompany.absolutevalue;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        
        int number = scanner.nextInt();
        
        int abs = (number <0) ? -number : number;
        System.out.println("Absolute value : " +abs);
    }
}
