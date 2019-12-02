package edu.jcourse.lesson8.io.indemo;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(
                "First string,\n" +
                        "Second string,\n" +
                        "Third string");

//        while (scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }
        System.out.println("Application started.");
        Scanner stringScanner = new Scanner(System.in);
        int input1 = stringScanner.nextInt();
        int input2 = stringScanner.nextInt();
        int sum = input1 + input2;
        System.out.println("Sum:" + sum);
//        System.out.println("B:" + stringScanner.next());
//
//
//        Scanner numberScanner = new Scanner(System.in);
//        int number = numberScanner.nextInt();
//        System.out.println(number);


    }
}
