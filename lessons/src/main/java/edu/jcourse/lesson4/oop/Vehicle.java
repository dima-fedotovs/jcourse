package edu.jcourse.lesson4.oop;

public class Vehicle {

    int passengers;
    int tank;
    float fuelPer100km;

    Vehicle() {
        System.out.println(" Car parameters");
    }

    Vehicle(int passengers, int tank, float fuelPer100km) {
        this.passengers = passengers;
        this.tank = tank;
        this.fuelPer100km = fuelPer100km;
    }

    public float distance() {
        return (tank * 100) / fuelPer100km;
    }

        public float distance(boolean isHighWay) {
        if (isHighWay) {
            return (tank * 100) / (fuelPer100km - 1.5F);
        } else {
            return (tank * 100) / fuelPer100km;
        }
    }


}
