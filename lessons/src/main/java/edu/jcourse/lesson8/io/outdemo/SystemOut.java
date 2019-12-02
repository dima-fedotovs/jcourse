package edu.jcourse.lesson8.io.outdemo;

import edu.jcourse.lesson5.tostring.Person;

public class SystemOut {

    public static void main(String[] args) {
//        int d;
//        d = 'S';
//        byte e;
//        e = 'C';
//        System.out.write(d);
//        System.out.write(e);
//        System.out.println("Simple row");
//
// Example for printf

        int a = 10;
        int b = 20;
        char c = '<';

        System.out.printf("a=%d %c b=%d\n", a, c, b);

        String name = "John";
        System.out.format("%s", name);
        System.out.printf("Your name is: %s\n", name);

        float x = 231.4544F;
        float y = 222.1143111131F;
//
        System.out.printf("X:   %f\n", x);
        System.out.printf("Y:   %.2f\n", y);
    }
}
