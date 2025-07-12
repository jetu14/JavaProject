package com.mycompany.multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner (System.in);
        
        System.out.print("Enter last number = ");
        int n  = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i=i+1) {         
                sum += i*i;
                System.out.print(i+"*"+i+"\t");         
        }
        System.out.println("\nSum = "+sum);
    }
}
