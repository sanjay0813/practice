package com.sanjay;

public class Main {

    public static void main(String[] args) {
        double myDouble = 20;
        double secondDouble = 80;
        double addMultiply = (myDouble + secondDouble) * 25;
        double remiander = addMultiply % 40;
        System.out.println(remiander);

        if (remiander <= 20)
            System.out.println("total was over the limit");
    }
}
