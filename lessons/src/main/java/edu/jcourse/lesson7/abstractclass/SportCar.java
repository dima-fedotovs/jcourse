package edu.jcourse.lesson7.abstractclass;

public class SportCar extends Vehicle {


    @Override
    public float distanceCityMode() {
        return (getTank() * 100) / (getFuelPer100km());
    }

    @Override
    public float distanceHighwayMode() {
        return (getTank() * 100) / (getFuelPer100km() - 4F);
    }
}
