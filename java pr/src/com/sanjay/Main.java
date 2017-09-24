package com.sanjay;

import com.s3s.exceptions.example.Calculator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator cal = new Calculator();
        System.out.println("beginning");
        double r = cal.divide(2,2);
        System.out.println("result: "+ r);
        System.out.println("end of prog");
    }
}
