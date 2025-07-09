package com.mycompany.bmi;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Total people : ");
        int totalPeople = scanner.nextInt();
        scanner.nextLine();
        
        int underweight = 0;
        int healthy = 0;
        int obese = 0;
        int overweight = 0;
        
        for(int i = 1 ; i <= totalPeople ; i++ ){
            System.out.println("\nPlease input person " +i+ "'s information!!!!");
            System.out.print("Enter Name : ");
            String name = scanner.nextLine();
            
            
            System.out.print("Enter weight : ");
            double weight = scanner.nextDouble();
            
            System.out.print("Enter height : ");
            double height = scanner.nextDouble();
            scanner.nextLine();
            
            double bmi = weight / ( height* height );
            System.out.println("BMI =  " +bmi);
            
            if(bmi <18.5 ){
                System.out.println(name+ " is Underweight");
                underweight++;     
            }
            else if (bmi >=18.5 && bmi <25 ){
                System.out.println(name+ " is Healthy");
                healthy++;
            }
            else if (bmi >=25 && bmi < 30){
                System.out.println(name+ " is Overweight");
                overweight++;
            }
            else{
                System.out.println(name+ " is Obese");
                obese++;
            }
                    
        }
        
        System.out.println("");
        System.out.println("Underweight users: " +underweight+ " , Healthy users: " + healthy+ " , Overweight users: " +overweight+ " , Obese users: " +obese);
        
        scanner.close();
    }
}

