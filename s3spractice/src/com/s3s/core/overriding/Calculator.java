package com.s3s.core.overriding;

/**
 * Created by kafle on 9/17/2017.
 */
public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    public int add(int x,int y,int z){
        return x + y + z;
    }

    // it is not overloading
    public int add(int ...data){
        int tmp = 0;
        for(int x : data){
            tmp += x;
        }
        return tmp;
    }

    // public static void main(String[] args){
       // Calculator cal = new Calculator();
        //cal.add(3,3,3,3,3,3,);
    // }
}
