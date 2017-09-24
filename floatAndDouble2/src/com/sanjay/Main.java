package com.sanjay;

public class Main {

    public static void main(String[] args) {
	// width of int=32 (4bytes)
        int x =5/3;
        //width of float=32(4bites)
        float y = 5f/3f;
        //width of double=64(8 bytes)
        double z = 5d/3d;
        System.out.println("intvalue= " +x);
        System.out.println("float value= "+y);
        System.out.println("double = "+z);

        // convert pounds to kilograms
        // 1 pound = 0.45359237 kg
        double valueInPounds = 200d;
        double kilograms = valueInPounds/2.2d;
        double kg2 = valueInPounds*0.4535927;
        System.out.println("kg= "+kilograms + " and " + kg2);
    }
}
