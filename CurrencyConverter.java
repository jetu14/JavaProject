package com.mycompany.currencyconverter;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in BDT: ");
        double bdt = input.nextDouble();

        double usd = bdt / 110.0;

        System.out.println("Equivalent in USD: " + usd);
    }
}
