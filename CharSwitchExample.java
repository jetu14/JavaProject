package com.mycompany.charswitchexample;

public class CharSwitchExample {

    public static void main(String[] args) {
        char alphabet = 'B';
        int aCount = 0, bCount = 0, cCount = 0;
        
        switch(alphabet){
            case 'A' :
                aCount++;
                break;
            case 'B' :
                bCount++;
                break;
            case 'C' :
                cCount++;
                break;
            default :
                System.out.println("Invaalid input....");
        }
        System.out.println("A count : " +aCount);
        System.out.println("B count : " +bCount);
        System.out.println("C count : " +cCount);
    }
}
