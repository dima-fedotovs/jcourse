package edu.jcourse.lesson5.inheritance;

import edu.jcourse.lesson4.oop.Vehicle;

public class OOPMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Abstract Animal");
        animal.setAge(100500);
        animal.sayHello();

        Cat cat = new Cat();
        cat.setName("Pushok");
        cat.setAge(10);
        cat.sayHello();
        cat.printAge();

        Dog dog = new Dog();
        dog.setName("Sharik");
        dog.setAge(5);
        dog.sayHello();
        dog.printAge();

        System.out.println(animal);
        System.out.println(cat);
//        Animal animal = new Animal();
//        animal.name = "Abstract Animal";
//        animal.sayHello();
//
//        Cat cat = new Cat();
//        cat.name = "Kitty";
//        cat.sayHello();

//        if (cat instanceof Animal) {
//            System.out.println(cat.name + " is animal.");
//        }

    }

    public static void test(Cat cat) {
        if(cat instanceof Animal) {

        }
    }
}
