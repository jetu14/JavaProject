package com.mycompany.arraydemo;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        double [] number = new double[5]; 
        double sum = 0.0;
        
        
        
        System.out.print("Please enter 5 numbers : ");
        number [0] = scanner.nextDouble();
        sum = number [0];
        double maxValue = number [0];
        double minValue =  number [0];
        
        for (int i = 1; i< number.length; i++){
            
            number [i] = scanner.nextInt();
            sum += number[i];
               
            if (maxValue < number [i]){
                maxValue = number [i];   
            }
            if(minValue > number [i]){
                    minValue = number [i];
                }
            
        }
        
        double avg = sum / number.length;
        System.out.println("Sum : " +sum);
        System.out.println("Average : " +avg);
        System.out.println("Maximum number : " +maxValue);
        System.out.println("Minimum number : " +minValue);
        
        
        
    }
}
