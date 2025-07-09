package com.mycompany.minicalculator;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b)); 
    }
}
