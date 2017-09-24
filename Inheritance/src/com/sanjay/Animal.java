package com.sanjay;

/**
 * Created by kafle on 6/6/2017.
 */
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private  int weight;

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("class called");
    }
    public void move(int speed){
        System.out.println("animal.move() called" + " animal is at " + speed +"speed");

    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(String name, int brain, int body, int size, int weight) {

        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
}
