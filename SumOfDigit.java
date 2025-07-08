
package com.mycompany.sumofdigit;

import java.util.Scanner;


public class SumOfDigit {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Integer number : " );
        int number = scanner.nextInt();
        
        int sum = 0;
        
        if(number > 0){
            
            sum += number % 10;
            number /=10;
            
        }
        System.out.println("The sum of the inputed integer number is : " +sum);
        
    }
}
