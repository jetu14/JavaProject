package com.mycompany.leapyearchecker;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entar a year : " );
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year+ " is a leap Year");
        }
        else{
            System.out.println(year+ " is not a leap year.");
        }
       
    }
}
