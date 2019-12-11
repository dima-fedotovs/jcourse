package edu.jcourse.apps.notepad;

import java.util.Scanner;

/*
Все делать самостоятельно:
step 1:
    command loop - это бесконечный цикл
    в нем у пользователья запрашивается команда;
    при помощи switch-case вызывается метод для выполнения
    этой команды
    Сделать команды:
        -- exit
        -- help
    Пример запуска:
        enter command> help
        this is very helpful manual....
        enter command> help
        this is very helpful manual....
        enter command> exit
        good bye!
step 2:
    создать класс Record в котором будут объявлены свойства:
        -- firstName (имя персоны)
        -- lastName (фамилия)
        -- phoneNumber (номер телефона)
        -- email (емейл)
    (подсказка: смотреть guessnum.GameResult)

 */
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
