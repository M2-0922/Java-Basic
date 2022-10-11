package com.javaclasses;

import com.javaclasses.Bike.Bike;
import com.javaclasses.Car.Car;
import com.javaclasses.Truck.Truck;

public class App {
    public static void main(String[] args) throws Exception {

        // create a bike object
        Bike bike = new Bike("2-stroke", 2, 1, "plastic", "LED", "plastic");

        // create a car object
        Car car = new Car("4-stroke", 4, 5, "metal", "LED", "plastic", "CD", "plastic", true);

        // create a truck object
        Truck truck = new Truck("6-stroke", 6, 3, "metal", "LED", "plastic", "CD", "plastic", true, "metal");

        System.out.println("====================");
        // print the bike object
        System.out.println(bike.getEngine());
        System.out.println(bike.getFuelTank());
        System.out.println(bike.getHandle());

        System.out.println("====================");
        // print the car object
        System.out.println(car.getEngine());
        System.out.println(car.getFuelTank());
        System.out.println(car.getSteering());

        System.out.println("====================");
        // print the truck object
        System.out.println(truck.getEngine());
        System.out.println(truck.getFuelTank());
        System.out.println(truck.getContainer());
        
    }
}
