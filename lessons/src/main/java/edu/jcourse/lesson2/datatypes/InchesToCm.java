package edu.jcourse.lesson2.datatypes;

public class InchesToCm {

    public static void main(String[] args) {
        double inches = Double.parseDouble(args[0]);
        double cm = inches * 2.54F;
        System.out.println("Result: " + cm);
    }
}
