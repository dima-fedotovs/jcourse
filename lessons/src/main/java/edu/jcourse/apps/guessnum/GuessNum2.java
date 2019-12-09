package edu.jcourse.apps.guessnum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNum2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<GameResult> leaderBoard = new ArrayList<>();

        do {
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
                    res.setName(name);
                    res.setTriesCount(i + 1);
                    res.setTime(gameEnd - gameStart);
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
        } while (askYesNo("Do you want to play new game? (y/n)"));

        System.out.println("Our leaders:");
        for (GameResult n : leaderBoard) {
            System.out.printf("%s %d %.1f%n", n.getName(), n.getTriesCount(), n.getTime() / 1000.0);
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

    static boolean askYesNo(String msg) {
        while (true) {
            System.out.println(msg);
            String answer = scanner.next();
            boolean isY = answer.equalsIgnoreCase("y");
            boolean isN = answer.equalsIgnoreCase("n");
            if (isY || isN) {
                return isY;
            }
            System.out.println("Enter 'y' or 'n'");
        }

    }
}
