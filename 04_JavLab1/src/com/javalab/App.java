package com.javalab;

import com.javalab.Birds.Eagle;
import com.javalab.Fish.Eel;
import com.javalab.Fish.Fish;
import com.javalab.Reptile.Crocodile;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Eagle eagle = new Eagle(25, 5, "Bird", "Warm", "Feathers", false);
        System.out.println(eagle.showInfo());
        
        Eel eel = new Eel(25, 10, "Fish", "Cold", true, "Gills", "Yes");
        System.out.println(eel.showInfo());

        Crocodile crocodile = new Crocodile(25, 15, "Reptile", "Cold", "Hard", "Yes", "No");
        System.out.println(crocodile.showInfo());
    }   
}
