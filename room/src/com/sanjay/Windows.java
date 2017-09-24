package com.sanjay;

import java.awt.*;

/**
 * Created by kafle on 6/16/2017.
 */
public class Windows {
    private int numberOfWindows;
    private String color;
    private Dimension dimension;

    public Windows(int numberOfWindows, String color, Dimension dimension) {
        this.numberOfWindows = numberOfWindows;
        this.color = color;
        this.dimension = dimension;
    }

    public void dimensons(int length, int breadth, int height){
       System.out.println("the dimensions are: length: "+ length+ "breadth: "+ breadth + "height: " +height);
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public String getColor() {
        return color;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
