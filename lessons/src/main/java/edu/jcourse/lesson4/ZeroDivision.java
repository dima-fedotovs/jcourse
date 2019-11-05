package edu.jcourse.lesson4;

public class ZeroDivision {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;

        if (a != 0 && (b / a) > 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
