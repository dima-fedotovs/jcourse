package edu.jcourse.lesson5.finalclass;

public class CircleMain {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(20);
        float area = circle.area();
        System.out.println("Circle area: " + area);
    }
}
