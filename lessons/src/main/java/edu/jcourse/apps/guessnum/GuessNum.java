package edu.jcourse.apps.guessnum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

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
10. Показать сообщение, если пользователь проиграл (isLooser)
11. Перед началом каждой партии спросить имя пользователя
12. После каждой партии спрашивать хочет ли пользователь начать новую партию
13. Сохранять результат каждой выигрышной партии в список (leaderBoard, GameResult)
14. По окончанию игры вывести результаты всех выигрышей (имя, кол-во попыток)
15. (домашка) Замерять время потраченное на партию и сохранять вместе с результатами в списке
    leaderBoard (System.currentTimeMillis)
16. (домашка) Валидация ввода ответа на вопрос, хочет ли пользователь еще одну партию.
    Можно ответить "y" или "n" - остальные варианты считаются ошибочными и вопрос повторяется.
*/
public class GuessNum {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<GameResult> leaderBoard = new ArrayList<>();

        while(true) {
            int myNum = random.nextInt(100) + 1;
            System.out.println(myNum);

            System.out.println("What is your name?");
            String name = scanner.next();

            long gameStart = System.currentTimeMillis();

            boolean isLooser = true;
            for (int i = 0; i < 10; i++) {
                int userNum = askNum(i + 1);
                if (userNum == myNum) {
                    long gameEnd = System.currentTimeMillis();
                    GameResult res = new GameResult();
                    res.name = name;
                    res.triesCount = i + 1;
                    leaderBoard.add(res);
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
        System.out.println("Our leaders:");
        for(GameResult n : leaderBoard) {
            System.out.println(n.name + " " + n.triesCount);
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
