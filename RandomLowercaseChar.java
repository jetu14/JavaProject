package com.mycompany.randomlowercasechar;

public class RandomLowercaseChar {

    public static void main(String[] args) {
        
        char randomLetter = (char)('a'+Math.random()*('z'-'a'+1));
        System.out.println("Random lower case  : " +randomLetter);
    }
}
