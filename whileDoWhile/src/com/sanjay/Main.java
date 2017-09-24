package com.sanjay;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int count = 1;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;


                continue;
            }
            System.out.println(count);
            System.out.println("even number " + number);
            number++;
            if(count>=5){
                break;
        }
        count++;

        }
        System.out.println("total even numbers "+count);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
