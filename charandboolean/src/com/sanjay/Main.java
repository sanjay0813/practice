package com.sanjay;

public class Main {

    public static void main(String[] args) {
	// \u00A9 from google chrome
        char copyright = '\u00A9';   //width 16 (2 bytes)
        System.out.println("unicode output = " +copyright);
        boolean myBoolean = false;
        boolean isFemale = true;

        char registered= '\u00AE';
        System.out.println(registered);

    }
}
