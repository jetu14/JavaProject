package com.mycompany.currencyconverter;

import javax.swing.*;

public class CurrencyConverter {

    public static void main(String[] args) {
        
 
        String input = JOptionPane.showInputDialog(null, "Enter amount in BDT/USD:", "Currency!", JOptionPane.INFORMATION_MESSAGE);
        int ammount = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null, "Enter 1 for BDT\nEnter 2 for USD \n", "Currency Coverter!", JOptionPane.INFORMATION_MESSAGE);
        
        int ammountType = Integer.parseInt(input);
        int currencyConvert;
        
        switch(ammountType){
            case 1 : 
                JOptionPane.showInputDialog(null, "USD to BDT");
                currencyConvert = ammount * 110;
                JOptionPane.showMessageDialog(null, ammount+ " USD to BDT " +currencyConvert);
                break;
            case 2 :
                    JOptionPane.showInputDialog(null, "BDT to USD");
                    currencyConvert = ammount / 110;
                    JOptionPane.showMessageDialog(null, ammount+ "BDT to USD" +currencyConvert);
                    break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid Option!\nPlease enter 1 or 2!!!");
                break;
        }
    }
}
