package edu.jcourse.apps.notepad;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

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
step 7: Новая тема
    Статические переменные - автоматический подсчет айдишек для рекорда
    см Record id и counter
    Конструктор - см Record()
-------------------
16 декабря
-------------------
Новые типы записей: PersonRecord и NoteRecord оба наследуются от Record
Домашка: Создать парочку своих типов записей
-------------------
18 декабря 2019
-------------------
Новый тип записей - AlarmRecord - наследуется от NoteRecord
В Alarmе добавляется время - будильник и текст наследуется от Note
- Тип данных - LocalTime
- Использование форматера (DateTimeFormatter) для парсинга и форматирования времени
- Более красивый способо toString
Самостоятельно:
- Создать еще один тип записей ReminderRecord
- наследуется от AlarmRecord
- Добавляется аттрибут - date (LocalDate)
Этот тип записей будет использоваться чтобы напомнить нам что-то в определенную
дату и в определенное время, например
"Незабыть поздравить друга с днем рождения 10 января в 10:00"
Домашка (идеи что поделать дома)
- Написать валидацию ввода даты и времени, чтобы программа не "падала"
    если пользователь ввел их некорректно
- Написать программку (отдельную), которая запросит у пользователя
  1. TimeZone пункта вылета
  2. Дату и время вылета
  3. TimeZone пункта назначения
  4. Дату и время прилета
  Программа должна высчитать длительность полёта

 */
public class Notepad {
    public static final String STR_TIME_PATTERN = "HH:mm";
    public static final DateTimeFormatter TIME_PATTERN
            = DateTimeFormatter.ofPattern(STR_TIME_PATTERN);

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
                case "list":
                    list();
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
        String type = askString("enter type: ");
        switch (type) {
            case "person":
                create(new PersonRecord());
                break;
            case "note":
                create(new NoteRecord());
                break;
            case "alarm":
                create(new AlarmRecord());
                break;
            default:
                System.out.println("error: unknown type");
        }
    }

    private static void create(Record aRecord) {
        aRecord.askData();
        records.add(aRecord);
        System.out.println("Created");
        System.out.println(aRecord);
    }

    static void list() {
        for (Record r : records) {
            System.out.println(r);
        }
    }

    static String askStringLine(String message) {
        System.out.print(message);
        Pattern delim = scanner.delimiter();
        scanner.useDelimiter("\n");
        String result = scanner.next();
        scanner.useDelimiter(delim);
        return result;
    }

    static String askString(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public static LocalTime askTime(String message) {
        String strTime = askString(message + " " + STR_TIME_PATTERN + " ");
        return LocalTime.parse(strTime, TIME_PATTERN);
    }
}
