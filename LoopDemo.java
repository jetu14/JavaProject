package com.mycompany.loopdemo;

import java.util.Scanner;

public class LoopDemo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter first number = ");
        int m = scanner.nextInt();
        System.out.print("Enter last number = ");
        int n  = scanner.nextInt();
        
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0){
                sum += i;
                System.out.print(i+" ");
            }  
        }
        System.out.println("\nSum = "+sum);
    }
}
