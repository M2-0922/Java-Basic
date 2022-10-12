/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javalab.Fish;

import com.javalab.Animal.Animal;

public class Fish extends Animal{

    // Attributes
    private boolean isLiveinWater;
    private String gills;

    // Default Constructor
    public Fish(){
    }

    // Parameterized Constructor
    public Fish(boolean isLiveInWater, String gills){
        this.isLiveinWater = isLiveInWater;
        this.gills = gills;
    }

    // Parameterized Constructor
    public Fish(int height, int weight, String animalType, String bloodType, boolean isLiveInWater, String gills){
        super(height, weight, animalType, bloodType);
        this.isLiveinWater = isLiveInWater;
        this.gills = gills;
    }

    // Getters and Setters

    public boolean isIsLiveinWater() {
        return this.isLiveinWater;
    }

    public void setIsLiveinWater(boolean isLiveinWater) {
        this.isLiveinWater = isLiveinWater;
    }

    public String getGills() {
        return this.gills;
    }

    public void setGills(String gills) {
        this.gills = gills;
    }

    
}
