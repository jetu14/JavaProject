package com.mycompany.gradeswitch;

import java.util.Scanner;

public class GradeSwitch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter your grade : ");
        String grade = scanner.nextLine();
        
        switch(grade){
            case "A+" :
                System.out.print("Excellent !");
                break;
            case "A" :
                System.out.print("Very Good !");
                break;
            case "B" :
                System.out.print("Good !");
                break;
            case "C" :
                System.out.print("Passed!");
                break;
            case "F" :
                System.out.print("Fail !");
                break;
            default :
                System.out.print("Invalid grade .");
        }     
    }
}
