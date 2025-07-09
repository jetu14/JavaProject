package com.mycompany.ageconverter;

import java.util.Scanner;

public class AgeConverter {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int years = scanner.nextInt();

        int months = years * 12;
        int days = years * 365;

        System.out.println("Your age in months: " + months);
        System.out.println("Your age in days: " + days);
    }
}
