package com.mycompany.readcharacter;

import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        System.out.println("You entered: " + ch);
    }
}

