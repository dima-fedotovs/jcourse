package edu.jcourse.lesson3;

public class TeamCalc {

    public static void main(String[] args) {
        if (args.length != 0) {
            double value1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double value2 = Double.parseDouble(args[2]);
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
                default:
                    System.out.println("No included");
            }
            System.out.println("Result: " + result);
            int i = 0;
            int a = 0;
            int b = 20;

            a += b;
            System.out.println(a);
        } else {
            System.out.println("Incorrect format: For example: 10 + 20");
        }
    }
}
