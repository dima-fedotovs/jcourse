package edu.jcourse.lesson8.io.indemo;

import java.util.Scanner;

public class SystemInExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter string:");
        while (scanner.hasNext()){
            String value = scanner.next();
            if ("quit".equals(value)) {
                break;
            } else {
                System.out.println(value);
            }
        }
    }
}
