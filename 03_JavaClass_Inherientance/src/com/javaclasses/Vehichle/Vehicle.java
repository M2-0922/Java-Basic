/*
 * @author kubilaycakmak
 * @date Oct 11, 2022
 * @version 1.0
 */
 
package com.javaclasses.Vehichle;

public class Vehicle {

    private String engine;
    private int wheels;
    private int seats;
    private String fuelTank;
    private String light;

    // parameterized constructor
    public Vehicle(String engine, int wheels, int seats, String fuelTank, String light) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.light = light;
    }

    // getters and setters
    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFuelTank() {
        return this.fuelTank;
    }

    public void setFuelTank(String fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String getLight() {
        return this.light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    // default constructor
    public Vehicle(){
    }

}
