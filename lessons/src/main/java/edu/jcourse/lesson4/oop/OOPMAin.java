package edu.jcourse.lesson4.oop;

public class OOPMAin {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Billy";
        dog.sayHello();

        Cat cat = new Cat();
        cat.name = "Kitty";
        cat.sayHello();
    }
}
