package com.mycompany.reversenumbers;

import java.util.Scanner;

public class ReverseNumbers {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner (System.in);
        
        int number;
        int lastDigit;
        int reverse = 0;
        
        System.out.println("Enter a positive number : ");
        number = scanner.nextInt();
        
        do {
            lastDigit = number % 10 ;
            reverse = (reverse * 10) + lastDigit ;
            number = number / 10;
        }while (number > 0);
        
        System.out.println("The number reversed is : " +reverse);
        
    }
}
