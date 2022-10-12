/*
 * @author kubilaycakmak
 * @date Oct 11, 2022
 * @version 1.0
 */
 
package com.javaclasses.Ford;

import com.javaclasses.Car.Car;

public class Ford extends Car{

    private String name;

    public Ford(){
    }
    
    public Ford(String name) {
        this.name = name;
    }

    public Ford(String name, String engine, int wheels, int seats, String fuelTank, String light, String steering, String stereo, String seatBelt) {
        super(engine, wheels, seats, fuelTank, light, steering, stereo, seatBelt);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
