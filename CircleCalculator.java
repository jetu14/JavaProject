/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circlecalculator;

import java.util.Scanner;

/**
 *
 * @author MSi
 */
public class CircleCalculator {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius : ");
        double radius = scanner.nextDouble();
        
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        
        System.out.println("For a circle with a radius of " +radius);
        System.out.println("Perimeter : " +perimeter);
        System.out.println("Area : " +area);
             
    }
}
