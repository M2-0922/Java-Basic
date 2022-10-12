/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javalab.Birds;

import com.javalab.Animal.Animal;

public class Birds extends Animal{
    
    // Attributes/Properties/Fields
    private String feathers;
    private boolean canFly;

    // Default Constructor
    public Birds(){
        super();
        // height
        // weight
        // animalType
        // bloodType
        this.feathers = "Unknown";
        this.canFly = false;
    }

    // Parameterized Constructor
    public Birds(int height, int weight, String animalType, String bloodType, String feathers, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.feathers = feathers;
        this.canFly = canFly;
    }

    // Getters and Setters
    public String getFeathers() {
        return this.feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean isCanFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
