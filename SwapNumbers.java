package com.mycompany.swapnumbers;

import java.util.Scanner;


public class SwapNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter second number : ");
        int b = scanner.nextInt();
        
        a = a + b ;
        b = a - b ;
        a = a - b ;
        
        System.out.println("\nAter swapping !!!! ");
        System.out.println("\nfirst number : " +a);
        System.out.println("Second number : " +b);
        
        
        
        
    }
}
