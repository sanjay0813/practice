package com.sanjay;

public class Main {

    public static void main(String[] args){

        CorePractice c1 = new CorePractice();
        SelfPractice s1 = new SelfPractice();

        System.out.println("sum of natural numbers");
        int natural = c1.getNaturalSum(5);
        System.out.println("the sum is: "+ natural);
        //int output = CorePractice.getNaturalSum(5);
        //System.out.println(output2);

        int[] myArray = {1,3,2,77,57};
        int len=myArray.length;
       // CorePractice.sort(myArray, true);
        c1.sort(myArray, true);

        String day = c1.getDayByNUmber(3);
        System.out.println("the day is:" + day);

        int factorial = c1.factorial(3);
        System.out.println("the relult is :" + factorial);

    }
}
