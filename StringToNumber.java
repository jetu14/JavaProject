package com.mycompany.stringtonumber;

public class StringToNumber {

    public static void main(String[] args) {
        String intString = "1234";
        String doubleString = "1234.4123";
        
        int intValue = Integer.parseInt(intString);
        double doubleValue = Double.parseDouble(doubleString);
        
        System.out.println("Integer : " +intValue);
        System.out.println("Double : " +doubleValue);
    }
}
