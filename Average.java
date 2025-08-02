package com.mycompany.average;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       int sum = 0 ;
       double average ;
       int value ;
       int count= 0 ;
       
        System.out.println("Enter an integer (O to quit) : ");
        value = scanner.nextInt();
        
        while (value != 0) {
            count  += 1 ;
            sum += value ;
            System.out.println("The sum so far is " +sum);
            System.out.println("Enter an intteger (0 to quit) : ");
            value = scanner.nextInt();
        }
        System.out.println("");
        if (count == 0){
            System.out.println("No values were entered!");
        }
        else {
            average = (double)sum / count;
            System.out.println("Sum of all values : " +sum);
            System.out.println("Average : " +average);
        }
    }
}
