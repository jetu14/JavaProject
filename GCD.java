package com.mycompany.gcd;

import javax.swing.JOptionPane;

public class GCD {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog(null, "Input n1 : " ,"Input Data",JOptionPane.INFORMATION_MESSAGE);
        int n1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog(null, "Input n1 : " ,"Input Data", JOptionPane.INFORMATION_MESSAGE);
        int n2 = Integer.parseInt(input2);
        
        int d = Math.min(n1, n2);
        int gcd = 1;
        while (d > 0){
            if(n1 % d == 0 && n2 % d == 0){
                gcd = d;
            }
            d--;
        }
        
        JOptionPane.showMessageDialog(null, "The gcd of n1 : " +n1+ " n2 : " +n2+ " is : " +gcd);
    }
}
