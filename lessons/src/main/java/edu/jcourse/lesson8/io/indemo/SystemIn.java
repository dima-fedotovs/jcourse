package edu.jcourse.lesson8.io.indemo;

import java.util.Scanner;

public class SystemIn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
//            System.out.println(scanner.nextInt());
            boolean x = scanner.nextBoolean();
            System.out.println(x);
            if (x) {
                break;
            }
        }
    }
}
