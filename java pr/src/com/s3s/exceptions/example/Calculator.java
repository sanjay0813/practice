package com.s3s.exceptions.example;

import com.MyDivideByZeroException;

/**
 * Created by kafle on 9/17/2017.
 */
public class Calculator {
    double divide(int x, int y) {
        try {
            if(y==0){
                throw new MyDivideByZeroException();
            }
            return x/y;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        return -1;
    }

}
