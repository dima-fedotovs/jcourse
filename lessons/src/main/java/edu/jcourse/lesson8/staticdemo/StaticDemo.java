package edu.jcourse.lesson8.staticdemo;

public class StaticDemo {

    public static void main(String[] args) {
        float r = 20;
        float circleArea = MathConstants.PI * (r * r);
        System.out.println("Circle Area: " + circleArea);
        System.out.println(MathConstants.sum(10, 20));
        String a = "Hello";
        boolean l = a.contains("l");
        boolean h = a.endsWith("o");

        String row = "1;Ivan;Petrov;my@mail.ru";

        String b = "1,Ivan,Petrov,#makaroni";
        String[] s = b.split(",");
        for (int i =0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}
