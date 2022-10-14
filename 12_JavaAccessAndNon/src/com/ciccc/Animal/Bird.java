package com.ciccc.Animal;
/*
 * @author kubilaycakmak
 * @date Oct 14, 2022
 * @version 1.0
 */
 
class Bird extends Animal {
    private boolean canFly;

    Bird(){
        canFly = true;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    String greeting(){
        return "Hello";
    }

    
}
