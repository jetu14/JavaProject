package com.mycompany.quadraticequation;

import javax.swing.JOptionPane;

public class QuadraticEquation {

    public static void main(String[] args) {
         String input = JOptionPane.showInputDialog(null, "Input the value of A : " , "Input Data" , JOptionPane.INFORMATION_MESSAGE);
         double a = Integer.parseInt(input);
         
         input = JOptionPane.showInputDialog(null, "Input the value of B :" , "Input Data" , JOptionPane.INFORMATION_MESSAGE);
         double b = Integer.parseInt(input);
         
         
         input = JOptionPane.showInputDialog(null, "Input the value of C :" , "Input Data" , JOptionPane.INFORMATION_MESSAGE);
         double c = Integer.parseInt(input);
         
         double discriminant = Math.pow(b, 2)-4*a*c;
         double r1 = (-b + Math.sqrt(discriminant)) / 2.0*a ;
         double r2 = (-b - Math.sqrt(discriminant)) / 2.0*a ;
         
         if(discriminant < 0){
             JOptionPane.showMessageDialog(null,"It has no real roots!");
         }
         else if(discriminant == 0){ 
             JOptionPane.showMessageDialog(null,"It has two real roots! \n"+r1);
         }
         else if(discriminant > 0){
             JOptionPane.showMessageDialog(null,"It has two real roots! \n"+r1+ "\n" +r2);
         }
         
         
    }
}
