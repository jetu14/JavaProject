package com.mycompany.palindrom;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Integer number : ");
        
        int number = scanner.nextInt();
        int reverse = 0;
        int temp = number;

        while (temp != 0){
            int reminder = temp % 10;
            reverse = reverse * 10 + reminder;
            temp = temp / 10;
        }
        
        System.out.println("Reverse number : " +reverse);
        
        if (number == reverse){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not palindrom!");
        }
        
    }
}
   
