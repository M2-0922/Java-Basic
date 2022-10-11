/*
 * @author kubilaycakmak
 * @date Oct 11, 2022
 * @version 1.0
 */
 
package com.javaclasses.Bike;

import com.javaclasses.Vehichle.Vehicle;

public class Bike extends Vehicle {
    private String handle;

    // default constructor
    public Bike(){
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

    public void setHandle(String handle) {
        this.handle = handle;
    }

}
