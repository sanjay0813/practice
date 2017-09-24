package com.s3s.core.interfacees;

/**
 * Created by kafle on 9/17/2017.
 */
public class Calculator implements iCalculator {
    @Override
    public long factorial(long n){
        if(n==0||n==1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
    @Override
    public long multiply(long n, long m){

    }
}
