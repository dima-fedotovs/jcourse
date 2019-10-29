package edu.jcourse.lesson2.datatypes;

public class BoolDemo {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a < b) {
            System.out.println(a + " < " + b);
        }
        if (a > b) {
            System.out.println(a + " > " + b);
        }

        if (a == b) {
            System.out.println(a + " = " + b);
        }
    }
}
