package com.mycompany.charactermethods;

public class CharacterMethods {

    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("Is digit : " +Character.isDigit(ch));
        System.out.println("Is letter : " +Character.isLetter(ch));
        System.out.println("To lower case : " +Character.toLowerCase(ch));
        System.out.println("To upper case : " +Character.toUpperCase('b'));
    }
}
