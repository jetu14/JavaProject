package com.mycompany.charactertest;

public class CharacterTest {

    public static void main(String[] args) {
        
        Character ch1 = Character.valueOf('a');
        Character ch2 = Character.valueOf('9');
        System.out.println(Character.isLowerCase(ch1));
        System.out.println(Character.isUpperCase(ch1));
        System.out.println(Character.isLetterOrDigit(ch2));
        System.out.println(Character.toUpperCase(ch1));
        
        
    }
}
