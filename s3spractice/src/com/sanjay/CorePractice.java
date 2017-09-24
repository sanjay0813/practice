package com.sanjay;

/**
 * Created by kafle on 9/16/2017.
 */
public class CorePractice {


    /*
    * return sum of natural number
     */
    public static int getNaturalSum(int n){
        return n*(n+1)/2;
    }

    /*
    * swap without additional variable
     */
    public void swap(int x, int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x=" +x +"/t" + "y=" + y);
    }

    /*
    * array sort
     */
    public void sort(int[] array, boolean isAsc){
        int length = array.length;

        int temp =0;
        //int array1[]={3,6,9,13,17,21};
        for(int i = 0; i < length; i++){
            for (int j =1; j<(length -i); j++){
                if(array [j-1] > array  [j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }
            }
        }
        for(int i=0;i<length;i++) {
            System.out.println(array[i]);

        }

    }

    /*
    * swith case
     */
    public String getDayByNUmber(int n) {
        String dayName = "unknown";
        switch (n) {
            case 1: {
                dayName = "sunday";
                break;
            }
            case 2: {
                dayName = "monday";
                break;
            }
            case 3: {
                dayName = "tuesday";
                break;
            }
            case 4: {
                dayName = "wednesday";
                break;
            }
            case 5: {
                dayName = "thursday";
                break;
            }
            case 6: {
                dayName = "friday";
                break;
            }
            case 7: {
                dayName = "saturday";
                break;
            }
            default: {
                System.out.println("123");
                break;
            }

        }return dayName;
    }

    /*
    *   factorial sum and fe
     */

    public static int factorial(int n){
        if (n <= 1){
            return  1;
        }
        else {
            return n = factorial(n-1);
        }
    }

    /*
    * fibonacci
     */

}
