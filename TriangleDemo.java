
package com.mycompany.triangledemo;

import java.util.Scanner;
public class TriangleDemo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base : ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height : ");
        double height = scanner.nextDouble();
        
        double area = 0.5*base*height;
        System.out.print("The area of the triangle is : " +area);
        
    }
}
