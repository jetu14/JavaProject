/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisibilitychecker;

import java.util.Scanner;

/**
 *
 * @author MSi
 */
public class DivisibilityChecker {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        
        boolean isDivisibleBy2 = number%2 == 0;
        boolean isDivisibleBy3 = number%3 == 0;
        
        if((isDivisibleBy2 || isDivisibleBy3) &&!(isDivisibleBy2 && isDivisibleBy3)){
        System.out.println("True");
        }
        else{
            System.out.println("False");
            
        }
    }
}

