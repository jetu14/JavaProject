package com.mycompany.paterndemo1;

import java.util.Scanner;

public class PaternDemo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter line numbers : ");
        int n = scanner.nextInt();
        
        for (int row = 1 ; row <= n ; row++){
            for (int col = 1 ; col <= row; col++){
                System.out.print(" " +col);
            } 
             System.out.println();
        }
    }
}
