package com.mycompany.numberstatistics;

import java.util.Scanner;

public class NumberStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] number =  new int[10];
        int zero = 0;
        int negativeNumber = 0;
        int positiveNumber = 0;
        int sum = 0;
        
        System.out.println("Please input ten integer numbr here : ");
        
        for (int i = 0 ; i < number.length; i++){
            System.out.print(i+1+ " : " );
            number[i] = scanner.nextInt();
            sum += number[i];
            
            if (number[i] == 0){
                zero++;             
            }
            else if (number[i] > 0){
                positiveNumber++;      
            }
            else if (number[i] < 0){
                negativeNumber++;
            }
        }
        
        
        float avg = (float)sum / 10;
        System.out.println("Zero inputed : " +zero);
        System.out.println("Positive integer inputed : " +positiveNumber);
        System.out.println("Negative integer inputed : " +negativeNumber);
        System.out.println("Positive integer inputed : " +positiveNumber);
        System.out.printf("Average of inputed integer numbers : %f" ,avg);
        
    }    
}
