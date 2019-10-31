package edu.jcourse.lesson3;

public class SwitchDemo {

    public static void main(String[] args) {
        char ch = 'A';

        switch (ch) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            default:
                System.out.println("Default");
        }
    }
}
