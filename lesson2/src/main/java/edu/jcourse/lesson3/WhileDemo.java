package edu.jcourse.lesson3;

public class WhileDemo {

    public static void main(String[] args) {
        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        int j = 0;
        while (j < a.length) {
            System.out.println(a[j]);
            j++;
        }

        int k = 0;
        do {
            System.out.println("Prints array content.");
            k++;
        } while (k < 5);


    }
}
