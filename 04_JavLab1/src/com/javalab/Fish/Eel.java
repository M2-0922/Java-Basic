/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javalab.Fish;

public class Eel extends Fish {
    private String isReleasingElectricity;


    public Eel(){}

    public Eel(String isReleasingElectricity){
        this.isReleasingElectricity = isReleasingElectricity;
    }

    public Eel(int height, int weight, String animalType, String bloodType, boolean isLiveInWater, String gills, String isReleasingElectricity){
        super(height, weight, animalType, bloodType, isLiveInWater, gills);
        this.isReleasingElectricity = isReleasingElectricity;
    }

    public String getIsReleasingElectricity() {
        return this.isReleasingElectricity;
    }

    public void setIsReleasingElectricity(String isReleasingElectricity) {
        this.isReleasingElectricity = isReleasingElectricity;
    }

    public String showInfo() {
        return "Eel [weight: " + super.getWeight() + ", height: " + super.getHeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", gills: " + super.getGills() + ", isReleasingElectricity: " + isReleasingElectricity + "]";
    }

}
