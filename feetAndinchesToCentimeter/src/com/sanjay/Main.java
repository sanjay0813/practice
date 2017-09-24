package com.sanjay;

public class Main {

    public static void main(String[] args) {
        calculateFeetandInchesToCentiMeters(0, 20);

        calculateFeetandInchesToCentiMeters(100);
    }
    public static double calculateFeetandInchesToCentiMeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) && (inches > 12))){
            System.out.println("invalid parameters");
            return -1;
        } else {
            double feetToInch = feet * 12;
            double addFeetInch = feetToInch + inches;
            double toCentimeters = addFeetInch * 2.54;
            System.out.println("ans:: " + toCentimeters);
            return toCentimeters;
        }
    }
   public static double calculateFeetandInchesToCentiMeters(double inches) {
        if (inches < 0) {
            System.out.println("yo yo");
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + "inches is equal to" + feet +"feet and" + remainingInches + "inches" );
            //double centiMeterToInch = centimeter / 2.54;
            //double centimeterToFeet = centiMeterToInch / 12;
            //System.out.println(centimeterToFeet);
            return calculateFeetandInchesToCentiMeters(feet, remainingInches);
        }
    }
}

