package edu.jcourse.apps.guessnum;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        1. Загадать число от 1 до 100 (Random nextInt)
        2. Попросить пользователя угадать это число (Scanner nextInt)
        3. Сравнить загаданное число с пользовательским (if)
        4. Вывести одно из сообщений
           a. Моё число больше
           b. Моё число меньше
           c. Угадал
        5. Дать пользователю 10 попыток на то чтобы угадать (for i)
        6. Если пользователь угадал - break (досрочный выход из цикла)
        7. Валидация ввода (если ввел буквы, а не цифры)
        8. (Домашка) Валидация ввода - если ввел в неправильном диапазоне (меньше 1 или больше 100)
        9. Бесконечно повторяющиеся партии - закончили одну игру началась новая с новым случайным числом
         */

        Random random = new Random();

        while(true) {
            int myNum = random.nextInt(100) + 1;

            boolean isLooser = true;
            for (int i = 0; i < 10; i++) {
                int userNum = askNum(i + 1);
                if (userNum == myNum) {
                    isLooser = false;
                    System.out.println("You win!");
                    break;
                }
                if (userNum > myNum) {
                    System.out.println("My num is less than yours");
                } else {
                    System.out.println("My num is greater than yours");
                }
            }
            if (isLooser) {
                System.out.println("You lost, my friend, the number was " + myNum);
            }
            System.out.println("Do you want to play new game? (y/n)");
            String answer = scanner.next();
            if (answer.equals("n")) {
                break;
            }
        }
        System.out.println("Good bye!");
    }

    static int askNum(int tryNr) {
        while (true) {
            try {
                System.out.printf("Try #%d. Enter your number: ", tryNr);
                int num = scanner.nextInt();
                if (num < 0 || num > 100) {
                    System.out.println("You have to enter number from 1 to 100");
                } else {
                    return num;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Oh! It isn't a number");
                scanner.next();
            }
        }
    }

}
