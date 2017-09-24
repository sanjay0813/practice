package com.sanjay;

public class Main {

    public static void main(String[] args) {
	// byte
    //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString="this is my string ";
        System.out.println("my string is = = " + myString + ", and its bull");
        myString= myString +"\u00A9 2015";
        System.out.println(myString);

        String numberString ="145.55";
        numberString = numberString + "45.25";
        System.out.println(numberString);

        String lastString ="10";
        int myInt=50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumber=120.75;
        lastString= lastString + doubleNumber;
        System.out.println(lastString);
    }
}
