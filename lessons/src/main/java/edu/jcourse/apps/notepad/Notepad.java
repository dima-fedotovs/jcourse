package edu.jcourse.apps.notepad;

import java.util.ArrayList;
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
step 3:
    Добавить новую команду "create" для выполнения которой,
    будет вызываться метод createRecord()
step 4:
    в createRecord опросить пользователя - собрать все данные для
    record (имя, фамилия, и т.д.)
    создать новый объект класса Record и наполнить его введенными данными
step 5:
    Объявить переменную для хранения списка рекордов - records - ArrayList
    сохранить созданный рекорд в методе createMethod в этот список
step 6:
    Новая команда - list - печатает на экран все имеющиеся рекорды
 */
public class Notepad {
    static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<Record> records = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.print("enter command> ");
            String cmd = scanner.next();
            switch (cmd) {
                case "help":
                    help();
                    break;
                case "create":
                    createRecord();
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

    static void createRecord() {
        String firstName = askString("first name: ");
        String lastName = askString("last name: ");
        String phone = askString("phone: ");
        String email = askString("email: ");

        Record record = new Record();
        record.setFirstName(firstName);
        record.setLastName(lastName);
        record.setPhoneNumber(phone);
        record.setEmail(email);

        records.add(record);
    }

    static String askString(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
