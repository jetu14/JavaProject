package com.mycompany.readmultiplewords;

import java.util.Scanner;

public class ReadMultipleWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three words separated by spaces: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        System.out.println("Word 3: " + word3);
    }
}