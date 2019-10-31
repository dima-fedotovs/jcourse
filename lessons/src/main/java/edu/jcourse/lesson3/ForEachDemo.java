package edu.jcourse.lesson3;

public class ForEachDemo {

    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int a : array) {
            System.out.println(a);
        }
    }
}

