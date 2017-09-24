package com.s3s.core.overriding;

/**
 * Created by kafle on 9/17/2017.
 */
public class Driver {
    public static void main(String [] args){
        Calculator cal = new Calculator();
        System.out.println(cal.add(2,3));
    }
}
