package edu.jcourse.lesson7.interfacedemo;

public class InterfaceMain {

    public static void main(String[] args) {
        MyInterface myInterface1 = new MyInterfaceImpl();

        MyInterface myInterface2 = new MyInterfaceImpl2();

        System.out.println(myInterface1.calculateDistance());
        System.out.println(myInterface2.calculateDistance());


//        CalcInterface calc = new CalcInterfaceImpl();
//        float sum = calc.sum(1, 3);
//        System.out.println(sum);
    }
}
