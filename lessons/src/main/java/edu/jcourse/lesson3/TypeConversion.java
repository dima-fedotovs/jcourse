package edu.jcourse.lesson3;

public class TypeConversion {

    public static void main(String[] args) {

        // Automatic casting
//        byte bVar = 10;
//        int iVar = bVar * 20;
//
//        long lVar;
//        double dVar;
//
//        lVar = 10_000;
//        dVar = lVar;
//
//        System.out.println("LVar and DVar: " + lVar + " " + dVar);
//        lVar = dVar;  // incompatible type
        // Manual casting
        double x, y;
        byte b;
        int i;
        char ch;

//        x = 10.0;
//        y = 3.0;
//        System.out.println("x/y: " + x/y);
//        i = (int) (x/y);
//        System.out.println("x/y: " + i);

//        i = 257; // 257
//        b = (byte) i;
//        System.out.println("b: " + b);

//        b = 90;
//        ch = (char) b;
//        System.out.println("char: " + ch);
//
        int iChar = 10086;
        ch = (char) iChar;
        System.out.println("ch from i: " + ch);

    }
}
