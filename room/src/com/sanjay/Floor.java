package com.sanjay;

/**
 * Created by kafle on 6/19/2017.
 */
public class Floor {
    private int dimension;
    private Carpet carpet;

    public Floor(int dimension, Carpet carpet) {
        this.dimension = dimension;
        this.carpet = carpet;
    }

    public int getDimension() {
        return dimension;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
