package com.sanjay;

public class Main {

    public static void main(String[] args) {
        //int has a width of 32
        int myMinValue= -2_147_483_648;
        int myMaxValue=  2_147_483_647;
        int myTotal= (myMinValue/2);
        System.out.println("myTotal=" +myTotal);
        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue="+myNewByteValue);
        //short nas a width of 16
        short myShortValue = 32767;
        //long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807l;
	// write your code here

        byte x = 99;
        short y = 855;
        int z = 123456;
        long p = 50000l+10l*(x+y+z);
        System.out.println("sharmaji = " +p);
    }
}
