package com;

/**
 * Created by kafle on 6/5/2017.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer() {
        this("sanjay",4500,"kaflesanjay@hotmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit,"unknown@hotmail.com");
        //System.out.println("name= "+ name + "credit = "+ creditLimit + "email = " + email );
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        //System.out.println("name = " + name + "credit limit = "+ creditLimit + "email = "+ email);
    }
}
