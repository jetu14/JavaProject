package com.mycompany.salarycalculator;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter Your basic salary : ");
        double salary = scanner.nextDouble();
        
        double bonus = salary * 0.10;
        
        double totalSalary = salary + bonus;
        System.out.println("Your total salary is : " +totalSalary+ " including bonus : " +bonus+ "Bdt");
              
    }
}
