package com.mycompany.testrandomcharacters;

import java.util.Scanner;

public class TestRandomCharacters {

    public static void main(String[] args) {
        
        System.out.print("A random character between 'a' and 'z' is: "); 
        System.out.println(RandomCharacter.getRandomLowerCaseLetter()); 
        
        System.out.print("A random character between 'A' and 'Z' is: "); 
        System.out.println(RandomCharacter.getRandomUpperCaseLetter()); 
        
        System.out.print("A random character between '0' and '9' is: ");
        System.out.println(RandomCharacter.getRandomDigitCharacter()); 
        
        System.out.print("A random character between 'g' and 'm' is: "); 
        System.out.println(RandomCharacter.getRandomCharacter('g', 'm')); 
        
        System.out.print("A random character between '3' and '7' is: "); 
        System.out.println(RandomCharacter.getRandomCharacter('3', '7'));
        
        System.out.print("A random character between '!' and '*' is: "); 
        System.out.println(RandomCharacter.getRandomCharacter('!', '*'));     
    }
}

 class RandomCharacter {
    
    public static char getRandomCharacter (char ch1 , char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1+1));
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a' , 'z');
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A' , 'Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter ('0','9');
    }
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
    
}
    