package edu.jcourse.lesson8.stringdemo;

public class StringDemo {

    public static void main(String[] args) {
        String str1 = new String("Hello Java");
        int jIndex = str1.indexOf("J");

        String substring = str1.substring(jIndex, str1.length() - 2);
        System.out.println(substring.trim());
        System.out.println(str1.contains("Java"));

//        boolean isEqual = str1 == str2;
//        System.out.println(isEqual);
//        isEqual = str1.equals(str2);
//        System.out.println(isEqual);
    }
}
