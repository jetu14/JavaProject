package com.mycompany.bmicalculator;

import java.util.Scanner;

public class BmiCalculator {
        public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
    }
}
