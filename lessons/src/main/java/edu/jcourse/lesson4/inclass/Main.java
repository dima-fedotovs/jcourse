package edu.jcourse.lesson4.inclass;

public class Main {

    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        miniVan.tank = 70;
        miniVan.fuelPer100km = 8.5F;
        miniVan.name = "Mini Van";
        miniVan.distance(true);

        Vehicle sedan = new Vehicle("Sedan", 5, 50, 9.5F);

        Vehicle sportCar = new Vehicle();
        sportCar.tank = 50;
        sportCar.fuelPer100km = 18.5F;
        sportCar.name = "Sport Car";
        sportCar.distance(true);

    }
}
