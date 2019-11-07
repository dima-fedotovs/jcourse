package edu.jcourse.lesson5.access.application;

import edu.jcourse.lesson5.access.PublicClass;

public class AppMain {

    public static void main(String[] args) {
        PublicClass defaultClass = new PublicClass();
        defaultClass.a = 10;
        defaultClass.b = 20;
//        defaultClass.c = 30;
//        defaultClass.d =12;
        defaultClass.printMessage();
    }
}
