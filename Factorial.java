package com.mycompany.factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter any positive integer : ");
        int n = scanner.nextInt();
        
        int factorial = 1;
        for(int i = n ; i >= 1 ; i--){
            factorial = factorial *i ;
        }
        System.out.println(n+"! = " +factorial);
    }
}
