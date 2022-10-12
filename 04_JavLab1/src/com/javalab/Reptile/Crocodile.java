/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javalab.Reptile;

public class Crocodile extends Reptile{

    public Crocodile(){}
    
    public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String backbone, String eggs){
        super(height, weight, animalType, bloodType, skinType, backbone, eggs);
    }

    public String showInfo() {
        return "Crocodile [weight: " + super.getWeight() + ", height: " + super.getHeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", skinType: " + super.getSkinType() + ", backbone: " + super.getBackbone() + ", eggs: " + super.getEggs() + "]";
    }

}
