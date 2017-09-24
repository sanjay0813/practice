package com.sanjay;

public class Main {

    public static void main(String[] args) {
	    char switchValue = 'c';
        switch(switchValue.toUper()){
            case 'A':
                System.out.println("value was 1");
                break;

            case 'B':
                System.out.println("value was b");
                break;

            case 'C':
                System.out.println("value was c");
                break;

            default:
                System.out.println("nothing");
                break;
        }
    }
}
