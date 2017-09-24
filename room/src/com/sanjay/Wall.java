package com.sanjay;

/**
 * Created by kafle on 6/19/2017.
 */
public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    private String material;
    private int thickness;
    private String color;

    public Wall(String material, int thickness, String color) {
        this.material = material;
        this.thickness = thickness;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public int getThickness() {
        return thickness;
    }

    public String getColor() {
        return color;
    }
}
