/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javalab.Birds;

public class Eagle extends Birds{

    public Eagle(){}

    public Eagle(int height, int weight, String animalType, String bloodType, String feathers, boolean isFly){
        super(height, weight, animalType, bloodType, feathers, isFly);
    }

    public String showInfo() {
        return "Eagle [weight: " + super.getWeight() + ", height: " + super.getHeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", feathers: " + super.getFeathers() + "]";
    }

}
