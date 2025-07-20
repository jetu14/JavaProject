package com.mycompany.stringexample;

public class StringExample {

    public static void main(String[] args) {
        String message = "Pookiee";
        
        System.out.println("Message : " +message);
        System.out.println("Length : " +message.length());
        System.out.println("First char : " +message.charAt(0));
        System.out.println("Last char : " +message.charAt(message.length()-1));
        System.out.println("Substring : " +message.substring(2,6));
    }
}
