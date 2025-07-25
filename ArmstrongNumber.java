package com.mycompany.armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter Integer number : ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;

        while (temp != 0){
            int reminder = temp % 10;
            sum = sum + reminder * reminder * reminder ; 
            temp = temp / 10 ;
        }
        if( sum == number){
            System.out.println("Armstrong number : " +sum);
        } 
        else {
            System.out.println("Not armstrong number!!");
        }
    }
}
