package com.mycompany.diagonalmatrix;

import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int [][] matrix1 = new int[3][3];
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;
        int diagonalElements = 0;
        
        System.out.println("Enter element for Matrix 1 : ");
        for (int row = 0 ; row < 3 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                System.out.printf("A[%d][%d] = ",row,col);
                matrix1 [row][col] = scanner.nextInt();
                
            }
            System.out.println("");
        }

        System.out.println("Matrix 1 :");
        for (int row = 0 ; row < 3 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                System.out.print(" " +matrix1[row][col]);
            }
            System.out.println("");
        }
        
        for (int row = 0 ; row < 3 ; row++){
            for (int col = 0 ; col < 3 ; col++){
                if(row == col){
                    diagonalElements = diagonalElements + matrix1[row][col];   
                }
                if (row <col){
                    sumOfUpperElements = sumOfUpperElements + matrix1[row][col];
                }
                if(row > col){
                    sumOfLowerElements = sumOfLowerElements + matrix1[row][col];
                }
            System.out.println("");
            }
        }
        System.out.println("Diagonal Elements : " +diagonalElements);
        System.out.println("Sum of Upper Triangle Elements : " +sumOfUpperElements);
        System.out.println("Sum of Lower Triangle Elements : " +sumOfLowerElements);
    }
}

