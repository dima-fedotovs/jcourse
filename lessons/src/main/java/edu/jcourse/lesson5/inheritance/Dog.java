package edu.jcourse.lesson5.inheritance;

public class Dog extends Animal{

    public void sayHello() {
        System.out.println(getName() + " says Gav");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
