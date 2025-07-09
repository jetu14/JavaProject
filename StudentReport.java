package com.mycompany.studentreport;

import java.util.Scanner;

public class StudentReport {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total student : ");
        int totalStudent = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 1 ; i<= totalStudent ; i++ ){
            
            System.out.print("\nEnter student name : ");
            String name = scanner.nextLine();
            
            System.out.print("Roll number : ");
            int rollNumber = scanner.nextInt();
            
            System.out.print("Math : ");
            double math = scanner.nextDouble();
            
            System.out.print("English : ");
            double english = scanner.nextDouble();
            
            System.out.print("Science : ");
            double science = scanner.nextDouble();
            
            double totalMarks = math + english + science ;
            double average = totalMarks / 3 ;
            double percentage = (totalMarks / 300) * 100 ;
            
            
            
            System.out.println(name+ ("'s (Roll number : ") +rollNumber+ (") grade report is published !!!!!") );
            System.out.println("Total Marks :" +totalMarks+ "\tAverage : " +average+ "\t\tPercentage : " +percentage);
            
            if(percentage > 100 || percentage < 0){
                System.out.print("Gpa : Non showable");
            }
            else if(percentage >=80 ){
                System.out.print("Gpa : 5.00");
            }
            
            else if (percentage >=70){
                System.out.println("Gpa : 4.00");
            }
            else if (percentage >= 60 ){
                System.out.print("Gpa : 3.50");
            }
            else if (percentage >= 50){
                System.out.print("Gpa : 3.00");
            }
            else if (percentage >= 40){
                System.out.print("Gpa : 2.00");
            }
            else {
            System.out.println("Gpa : 0.0");
            }
            scanner.nextLine();
            
        }
    }
}
