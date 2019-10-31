package edu.jcourse.lesson3;

public class Calc {

    public static void main(String[] args) {
        if (args.length != 0) {
            double value1 = Double.parseDouble(args[0]);
            double value2 = Double.parseDouble(args[2]);
            String operator = args[1];
            double result = 0;
            if ("+".equals(operator)) {
                result = value1 + value2;
            } else if ("-".equals(operator)) {
                result = value1 - value2;
            } else if ("*".equals(operator)) {
                result = value1 * value2;
            } else if ("/".equals(operator)) {
                result = value1 / value2;
            } else if ("%".equals(operator)) {
                result = value1 % value2;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Please enter a correct format:\nFor example: 1 + 2");
        }
    }
}