package edu.jcourse.lesson7.abstractclass;

public class AbstractMain {

    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        sportCar.setTank(50);
        sportCar.setFuelPer100km(18.5F);
        float distance = sportCar.distance(false);
        System.out.println(distance);
    }
}
