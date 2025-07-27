package com.mycompany.sampledialogbox1;

import javax.swing.*;
public class SampleDialogBox1 {

    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog (null, "Enter Your Name :" , "Input name",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog (null, "Your Name : " +name , "Input name",JOptionPane.INFORMATION_MESSAGE);
    }
}