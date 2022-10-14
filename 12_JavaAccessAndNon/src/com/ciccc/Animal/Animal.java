package com.ciccc.Animal;
/*
 * @author kubilaycakmak
 * @date Oct 14, 2022
 * @version 1.0
 */
 
class Animal {
    private String name;

    Animal(){
        name = "Duck";
    }

    String greeting(){
        return "Hello";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.isCanFly());
    }

    
}
