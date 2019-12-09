package edu.jcourse.lesson7.interfacedemo;

public abstract class Vehicle implements DistanceCalculator {

    private int tank;
    private float fuelPer100km;

    public float distance(boolean isHighway){
        if (isHighway) {
            return highwayMode();
        } else {
            return cityMode();
        }
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public float getFuelPer100km() {
        return fuelPer100km;
    }

    public void setFuelPer100km(float fuelPer100km) {
        this.fuelPer100km = fuelPer100km;
    }
}
