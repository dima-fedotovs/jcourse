package edu.jcourse.lesson7.interfacedemo;

public class SportCar extends Vehicle {

    @Override
    public float cityMode() {
        return (getTank() * 100) / (getFuelPer100km());
    }

    @Override
    public float highwayMode() {
        return (getTank() * 100) / (getFuelPer100km() - 3F);
    }
}
