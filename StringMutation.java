package com.mycompany.stringmutation;

public class StringMutation {
    public static void main(String[] args) {
        String phrase = "Change is inevitable";

        String mutation1 = phrase.concat(", except from vending machines.");
        String mutation2 = mutation1.toUpperCase();
        String mutation3 = mutation2.replace('E','X'); 
        String mutation4 = mutation3.substring(3,16);
        

        System.out.println("Original: " + phrase);
        System.out.println("Mutation 1: " + mutation1);
        System.out.println("Mutation 2: " + mutation2);
        System.out.println("Mutation 3: " + mutation3);
        System.out.println("Mutation 4: " + mutation4);
        System.out.println("Length of Mutation 4: " + mutation4.length());
    }
}