package edu.jcourse.lesson5.inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(getName() + " says Meow");
    }

    protected void finalize() {
        System.out.println("Finalize class");
    }

    @Override
    public String toString() {
        return "Kotik " + getName();
    }
}
