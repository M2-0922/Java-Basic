/*
 * @author kubilaycakmak
 * @date Oct 11, 2022
 * @version 1.0
 */
 
package com.javaclasses.Bike;

import com.javaclasses.Vehichle.Vehicle;

public class Bike extends Vehicle {
    // private long id;
    private String handle;
    public int amount;
    // default constructor
    Bike(){
        this.handle = "long";
        this.amount = 5;
    }

    // parameterized constructor
    public Bike(String engine, int wheels, int seats, String fuelTank, String light, String handle) {
        super(engine, wheels, seats, fuelTank, light);
        this.handle = handle;
    }

    public Bike(String handle) {
        this.handle = handle;
    }

    // getters and setters
    public String getHandle() {
        return this.handle;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    

    // public String sayMyName(){
    //     String name = "John";
    //     return name;
    // }

}
