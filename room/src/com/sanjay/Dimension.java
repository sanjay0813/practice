package com.sanjay;

/**
 * Created by kafle on 6/19/2017.
 */
public class Dimension {
    private int length;
    private int width;
    private int height;

    public Dimension(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
