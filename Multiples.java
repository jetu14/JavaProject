package com.mycompany.multiples;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        final int PER_LINE = 5; // Maximum 5 numbers per line
        int value, limit, count = 0;

        Scanner scanner = new Scanner(System.in);

        // Ask the user for a positive number
        System.out.print("Enter a positive number (to find its multiples): ");
        value = scanner.nextInt();

        // If the user enters 0 or a negative number, ask again
        while (value <= 0) {
            System.out.print("Invalid input! Please enter a POSITIVE number: ");
            value = scanner.nextInt();
        }

        // Ask the user for an upper limit
        System.out.print("Enter an upper limit: ");
        limit = scanner.nextInt();

        // Make sure the limit is not less than the value
        while (limit < value) {
            System.out.print("Upper limit must be greater than or equal to the value. Try again: ");
            limit = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Multiples of " + value + " up to " + limit + " are:");

        // Loop to print multiples of the given number
        for (int multiple = value; multiple <= limit; multiple += value) {
            System.out.print(multiple + "\t"); // Print the current multiple

            count++; // Increase the count

            // After every 5 values, move to the next line
            if (count % PER_LINE == 0) {
                System.out.println();
            }
        }

        scanner.close(); // Close the scanner (good practice)
    }
}
