package com.sanjay;

/**
 * Created by kafle on 6/2/2017.
 */
public class car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("commodore")){
            this.model = model;
        }
        else {
            this.model = "unknown";
        }
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
}
