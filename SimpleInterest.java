package com.mycompany.simpleinterest;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + interest);
    }
}
