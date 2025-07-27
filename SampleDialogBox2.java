package com.mycompany.sampledialogbox2;

import javax.swing.*;

public class SampleDialogBox2 {
    
    public static void main(String[] args) {
        
        String first = JOptionPane.showInputDialog(null , "Enter first integer : " , "Input integer : " , JOptionPane.QUESTION_MESSAGE);
        int num1 = Integer.parseInt(first);
        
        String second = JOptionPane.showInputDialog(null , "Enter second integer : " , "Input integer : " , JOptionPane.INFORMATION_MESSAGE);
        int num2 = Integer.parseInt(second);
        
        int sum = num1 + num2 ;
        
        JOptionPane.showMessageDialog(null , num1+" + " +num2+ " = "+sum  , "Result : " ,JOptionPane.INFORMATION_MESSAGE);
        
    }
}
