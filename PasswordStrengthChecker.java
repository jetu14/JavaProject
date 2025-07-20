package com.mycompany.passwordstrengthchecker;

import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter at least 8 character :");
        String password = scanner.next();
        
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;
        
        String specialChars ="~!@#$%^&*()_+{}:|<>?/.,\';][=-`";
        
        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            
            if (Character.isDigit(ch)){
                hasDigit = true;
            }
            else if (Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
            else if (specialChars.contains(String.valueOf(ch))){
                hasSpecialChar = true;
            }
        }
        
        if (password.length() >= 8 && hasDigit && hasUpperCase &&  hasSpecialChar){
            System.out.println("Strong password");
        }
        else {
            System.out.println("Weak password");
            System.out.println("Tips to improve :");
            if(password.length() < 8 ) {
                System.out.println("At least 8 characters");
            }
            if(!hasDigit){
                System.out.println("Add at least one digit!");
                
            }
            if(!hasUpperCase){
                System.out.println("Add at least one upper case!");
            }
            if(!hasSpecialChar){
                System.out.println("Add at least one specialChar!");
            }
                
            
        
        }
    }    
}
