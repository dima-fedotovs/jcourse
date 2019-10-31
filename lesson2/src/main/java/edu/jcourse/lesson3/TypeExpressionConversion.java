package edu.jcourse.lesson3;

public class TypeExpressionConversion {

    public static void main(String[] args) {
        // Casting in expression
        byte b;
        int i;
        b = 10;
        i = b * b;

        b = 10;
        b = (byte) (b * b);

        System.out.println("i and b: " + i + " " + b);

        char ch1 = 'a';
        char ch2 = 'b';
        char ch;
        ch = (char) (ch1 + ch2);
        System.out.println("ch: " + ch);
    }
}
