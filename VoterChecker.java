package com.mycompany.voterchecker;

import java.util.Scanner;

public class VoterChecker {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        
        if(age >= 18 ){
            
            System.out.print("Do you have NID : ");
            scanner.nextLine();
            String nid = scanner.nextLine();
            
            if(nid.equalsIgnoreCase("yes")){
                System.out.print("You are eligile to vote . ");
            }
            else {
                System.out.println("Sorry, You need a NID to vote!!");
            }
        }
        else{
            System.out.print("You are not eligible to vote.");
        }
    }
}
