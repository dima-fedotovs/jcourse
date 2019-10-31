package edu.jcourse.lesson3;

public class SwitchCalc {

    public static void main(String[] args) {
        if (args.length != 0) {
            double value1 = Double.parseDouble(args[0]);
            double value2 = Double.parseDouble(args[2]);
            String operator = args[1];
            double result = 0;
            switch (operator) {
                case "+":
                    result = value1 + value2;
                    break;
                case "-":
                    result = value1 - value2;
                    break;
                case "*":
                    result = value1 * value2;
                    break;
                case "/":
                    result = value1 / value2;
                    break;
                default:
                    System.out.println("Help: Please enter a correct format:\nFor example: 1 + 2");
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Please enter a correct format:\nFor example: 1 + 2");
        }

    }
}
