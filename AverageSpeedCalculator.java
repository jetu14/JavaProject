
package com.mycompany.averagespeedcalculator;

/**
 *
 * @author MSi
 */
public class AverageSpeedCalculator {

    public static void main(String[] args) {
        
        
        int minutes = 45;
        int seconds =60;
        
        double distanceInKm = 14.0;
        double totalTimeInHours = (minutes + seconds /60.0)/60.0;
        
        double distanceInMiles = distanceInKm /1.6;
        
        
        double avgSpeed = distanceInMiles/distanceInMiles;
        System.out.println("Average speed is  " +avgSpeed+ "mph");
        
    }
}
