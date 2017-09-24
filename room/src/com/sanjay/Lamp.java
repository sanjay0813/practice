package com.sanjay;

/**
 * Created by kafle on 6/23/2017.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public String getStyle() {
        return style;
    }

    public void turnOn(){
        System.out.println("trun on");
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public Lamp(String style, boolean battery, int globRating) {

        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
}
