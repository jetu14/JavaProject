package com.mycompany.booleanflagexample;

public class BooleanFlagExample {

    public static void main(String[] args) {
        boolean found = false;
        int [] data = {2,4,5,6,7};
        int target = 6;
        
        for(int value : data){
            if(value == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Target value founded! ");
        }
        else {
            System.out.println("Target value not found!");
        }
    }
}
