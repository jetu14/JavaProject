
package com.mycompany.matrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [][] matrix1 = new int[2][3];
        int [][] matrix2 = new int[2][3];
        int [][] sum = new int [2][3];
        
        System.out.println("Enter element for Matrix 1 : ");
        for (int row = 0 ; row < 2 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                System.out.printf("A[%d][%d] = ",row,col);
                matrix1 [row][col] = scanner.nextInt();
                
            }
            System.out.println("");
        }
        
        System.out.println("Enter element for Matrix 2 : ");    
        for (int row = 0 ; row < 2 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                System.out.printf("A[%d][%d] = " ,row,col);
                matrix2 [row][col] = scanner.nextInt();
                
            }
            System.out.println("");
        }
        System.out.println("Matrix 1 :");
        for (int row = 0 ; row < 2 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                System.out.print(" " +matrix1[row][col]);
            }
            System.out.println("");
        }
        
 
        System.out.println("Matrix 2 :");         
        for (int row = 0 ; row < 2 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                System.out.print(" " +matrix2[row][col]);
            }
            System.out.println("");
        }
        
        System.out.println("Sum of Matrix 1 & Matrix 2 :");
        for (int row = 0 ; row < 2 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                sum [row] [col] = matrix1 [row][col] +matrix2 [row][col];
                System.out.print(" " +sum[row][col]);
            }
            System.out.println("");
        }
    }
}
