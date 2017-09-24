package com.sanjay;

/**
 * Created by kafle on 6/17/2017.
 */
public class furniture {
    private int beds;
    private int sofas;
    private int diningTable;
    private int chairs;

    public furniture(int beds, int sofas, int diningTable, int chairs) {
        this.beds = beds;
        this.sofas = sofas;
        this.diningTable = diningTable;
        this.chairs = chairs;
    }

    public void furniture(){
        System.out.println("there are fornitures in the room");
    }

    public int getBeds() {
        return beds;
    }

    public int getSofas() {
        return sofas;
    }

    public int getDiningTable() {
        return diningTable;
    }

    public int getChairs() {
        return chairs;
    }
}
