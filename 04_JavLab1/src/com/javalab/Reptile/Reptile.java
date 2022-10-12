/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
package com.javalab.Reptile;

import com.javalab.Animal.Animal;

public class Reptile extends Animal{

    // Attributes
    private String skinType;
    private String backbone;
    private String eggs;

    // Default Constructor
    public Reptile(){
    }

    // Parameterized Constructor
    public Reptile(String skinType, String backbone, String eggs){
        this.skinType = skinType;
        this.backbone = backbone;
        this.eggs = eggs;
    }

    // Parameterized Constructor
    public Reptile(int height, int weight, String animalType, String bloodType, String skinType, String backbone, String eggs){
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.backbone = backbone;
        this.eggs = eggs;
    }

    // Getters and Setters

    public String getSkinType() {
        return this.skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBackbone() {
        return this.backbone;
    }

    public void setBackbone(String backbone) {
        this.backbone = backbone;
    }

    public String getEggs() {
        return this.eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

    
}
