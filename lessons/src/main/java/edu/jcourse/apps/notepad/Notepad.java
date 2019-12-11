package edu.jcourse.apps.notepad;

import java.util.Scanner;

// Самостоятельно:
// command loop:
// бесконечный цикл
// в нем у пользователья запрашивается команда
// при помощи switch-case вызывается метод для выполнения
// этой команды
// -- exit
// -- help
public class Notepad {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("enter command> ");
            String cmd = scanner.next();
            switch (cmd) {
                case "help":
                    help();
                    break;
                case "exit":
                    System.out.println("good bye!");
                    return;
                default:
                    System.out.println("error: unknown command!");
            }
        }
    }

    static void help() {
        System.out.println("This could be very helpful text");
    }
}

// Пример запуска
/*
enter command> help
this is program to executes....
enter command> help
this is program to executes....
enter command> exit
good bye



 */