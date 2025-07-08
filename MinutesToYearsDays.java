
package com.mycompany.minutestoyearsdays;

import java.util.Scanner;
public class MinutesToYearsDays {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter minutes : ");
        int minutes = scanner.nextInt();
        
        long totalDays = minutes/(60*24);
        long years = totalDays / 365;
        long days = totalDays % 365;
        
        System.out.println(minutes+ " minutes is approximately " +years+ " years and " +days+ " days." );
        
    }
}
