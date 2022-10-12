package com.javacomposition;

import com.javacomposition.GraphicCard.GraphicCard;
import com.javacomposition.Laptop.Laptop;
import com.javacomposition.Processor.Processor;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Create a new object of the class Laptop
        Laptop myLaptop = new Laptop();
        System.out.println(myLaptop.showInfo());

        Processor myProcessor = new Processor("Intel", "i7", "8th Gen", "12 Cores", "12 Threads");
        GraphicCard graphicCard = new GraphicCard();
        // Create a new object of the class Laptop
        Laptop myLaptop2 = new Laptop("15.6 inch", "Backlit", true, "8GB", "1TB", myProcessor, graphicCard);

        System.out.println(myLaptop2.getProcessor().getProcessorCores());
    }
}
