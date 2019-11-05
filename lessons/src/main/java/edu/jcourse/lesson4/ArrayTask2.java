package edu.jcourse.lesson4;

public class ArrayTask2 {

    public static void main(String[] args) {
        int arraySize = 10;
        float elements[] = new float[arraySize];

        float sum = 0;

        for (int i = 0; i < elements.length; i++) {
            elements[i] = (i + 1) * 7;
            sum += elements[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Elements: " + elements.length);
        System.out.println("Average: " + sum / elements.length);
    }
}
