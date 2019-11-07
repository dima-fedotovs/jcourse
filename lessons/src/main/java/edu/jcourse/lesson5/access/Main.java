package edu.jcourse.lesson5.access;

public class Main {

    public static void main(String[] args) {
        PublicClass defaultClass = new PublicClass();
        defaultClass.a = 20;
        defaultClass.b = 30;
        defaultClass.c = 40;
        defaultClass.printMessage();
    }
}
