/*
 * @author kubilaycakmak
 * @date Oct 11, 2022
 * @version 1.0
 */
 
package com.javaclasses.Truck;

import com.javaclasses.Vehichle.Vehicle;

public class Truck extends Vehicle{

    private String steering;
    private String stereo;
    private String seatBelt;
    private boolean AC;
    private String container;

    // default constructor
    public Truck(){
    }

    // parameterized constructor
    public Truck(String engine, int wheels, int seats, String fuelTank, String light, String steering, String stereo, String seatBelt, boolean AC, String container) {
        super(engine, wheels, seats, fuelTank, light);
        this.steering = steering;
        this.stereo = stereo;
        this.seatBelt = seatBelt;
        this.AC = AC;
        this.container = container;
    }

    public Truck (String steering, String stereo, String seatBelt, boolean AC, String container) {
        this.steering = steering;
        this.stereo = stereo;
        this.seatBelt = seatBelt;
        this.AC = AC;
        this.container = container;
    }

    // getters and setters

    public String getSteering() {
        return this.steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getStereo() {
        return this.stereo;
    }

    public void setStereo(String stereo) {
        this.stereo = stereo;
    }

    public String getSeatBelt() {
        return this.seatBelt;
    }

    public void setSeatBelt(String seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean isAC() {
        return this.AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public String getContainer() {
        return this.container;
    }

    public void setContainer(String container) {
        this.container = container;
    }
    
}
