package edu.jcourse.lesson7;

public class TernaryDemo {

    public static void main(String[] args) {
        int num = 8;
        String message = "";
        if (num > 10) {
            message = "Number is greater than 10.";
        } else {
            message = "Number is less than 10.";
        }

        System.out.println(message);

        String message1 = num > 10 ? "Number is greater than 10" : "Number is less than 10";
        System.out.println(message);
        System.out.println(message1);
    }
}
