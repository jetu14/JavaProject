package com.mycompany.series2;

import java.util.Scanner;

public class Series2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        int n = scanner.nextInt();
        
        int result = 0;
        for(int i = 1; i<= n ; i++){
            result = i * i;
            System.out.println(i+ " * " +i+ " = " +result);
        }   
    }
}
