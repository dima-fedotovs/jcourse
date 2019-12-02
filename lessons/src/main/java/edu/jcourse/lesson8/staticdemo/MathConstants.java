package edu.jcourse.lesson8.staticdemo;

public class MathConstants {
    // Static Block
    static {
        System.out.println("Message");
    }

    // Static Variable
    public static final float PI = 3.14F;

    // Static Method
    public static float sum(float a, float b) {
        return a + b;
    }
}
