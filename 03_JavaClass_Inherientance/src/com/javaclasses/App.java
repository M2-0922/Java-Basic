package com.javaclasses;

import com.javaclasses.Bike.Bike;
import com.javaclasses.Car.Car;
import com.javaclasses.Ford.Ford;
import com.javaclasses.Truck.Truck;

public class App {
    public static void main(String[] args) throws Exception {
        // create a bike object
        // Bike bike = new Bike("2-stroke", 2, 1, "plastic", "LED", "plastic");
        // System.out.println(bike.handle);
        // create a car object

        // System.out.println(Bike.amount);
        Bike bike = new Bike();
        System.out.println(bike.amount);
        System.out.println(bike.getHandle());


        Car car = new Car("4-stroke", 4, 5, "metal", "LED", "plastic", "CD", "plastic", true);

        // create a truck object
        Truck truck = new Truck("6-stroke", 6, 3, "metal", "LED", "plastic", "CD", "plastic", true, "metal");

        Ford mustang = new Ford("Mustang", "4-stroke", 4, 5, "metal", "LED", "plastic", "CD", "plastic");

        Ford f150 = new Ford();
        

        System.out.println(mustang.getName());
        System.out.println(mustang.getEngine());
        System.out.println("====================");
        // print the bike object
        // System.out.println(bike.getEngine());
        // System.out.println(bike.getFuelTank());
        // System.out.println(bike.getHandle());

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
