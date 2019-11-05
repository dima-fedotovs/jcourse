package edu.jcourse.lesson4.oop;


import edu.jcourse.lesson4.oop.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        miniVan.passengers = 7;
        miniVan.tank = 70;
        miniVan.fuelPer100km = 7;

        System.out.println("MiniVan: " + miniVan.passengers + " " + miniVan.tank + " " + miniVan.fuelPer100km);
        System.out.println("Distance: " + miniVan.distance());
//        System.out.println("Distance: " + miniVan.distance(false));



        Vehicle sportCar = new Vehicle();
        sportCar.passengers = 2;
        sportCar.tank = 100;
        sportCar.fuelPer100km = 20;
        System.out.println("SprotCar: " + sportCar.passengers + " " + sportCar.tank + " " + sportCar.fuelPer100km);
        System.out.println("Distance: " + sportCar.distance());
//        System.out.println("Distance: " + sportCar.distance(true));

        Vehicle sedan = new Vehicle(5, 50, 9.5F);
        System.out.println("Sedan Distance: " + sedan.distance());
//        System.out.println("Sedan Distance: " + sedan.distance(true));
    }
}
