/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celsiustofahrenheit;

import java.util.Scanner;

/**
 *
 * @author MSi
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter celsius : ");
        int celsius = scanner.nextInt();
        
        double fahrenheight = (9.0/5.0)*celsius + 32.0;
        System.out.println("Fahrenheight : " +fahrenheight);
        
    }
}
