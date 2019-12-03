package edu.jcourse.lesson11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        printList(list);
        list.remove(2);
        printList(list);
        list.add(1, "String 5");
        printList(list);
    }

    private static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
