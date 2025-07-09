package com.mycompany.squarerootcalculator;

import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double root = Math.sqrt(number);

        System.out.println("Square root = " + root);
    }
}
