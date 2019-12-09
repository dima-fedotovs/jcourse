package edu.jcourse.apps.guessnum;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LeaderBoard {
    private final ArrayList<GameResult> leaderBoard = new ArrayList<>();
    private final File file = new File("leaderboard.txt");

    public void add(GameResult result) {
        leaderBoard.add(result);
    }

    public void print2() {
        System.out.println("Our leaders:");
        leaderBoard.sort(Comparator
                .comparingInt(GameResult::getTriesCount)
                .thenComparingLong(GameResult::getTime));
        for (int i = 0; i < Math.min(5, leaderBoard.size()); i++) {
            GameResult n = leaderBoard.get(i);
            System.out.printf("%s %d %.1f%n", n.getName(), n.getTriesCount(), n.getTime() / 1000.0);
        }
    }

    public void print3() {
        System.out.println("Our leaders:");
        leaderBoard.sort(Comparator
                .comparingInt(GameResult::getTriesCount)
                .thenComparingLong(GameResult::getTime));
        int i = 0;
        for (GameResult n : leaderBoard) {
            System.out.printf("%s %d %.1f%n", n.getName(), n.getTriesCount(), n.getTime() / 1000.0);
            i++;
            if (i == 5) {
                break;
            }
        }
    }

    public void print4() {
        System.out.println("Our leaders:");
        leaderBoard.sort(Comparator
                .comparingInt(GameResult::getTriesCount)
                .thenComparingLong(GameResult::getTime));

        int size = Math.min(5, leaderBoard.size());
        for (GameResult n : leaderBoard.subList(0, size)) {
            System.out.printf("%s %d %.1f%n", n.getName(), n.getTriesCount(), n.getTime() / 1000.0);
        }
    }

    public void print() {
        System.out.println("Our leaders:");
        leaderBoard.stream()
                .sorted(Comparator
                        .comparingInt(GameResult::getTriesCount)
                        .thenComparingLong(GameResult::getTime))
//                .filter(result -> result.getTriesCount() == 3)
                .limit(5)
                .forEach(result ->
                        System.out.printf("%s %d %.1f%n",
                                result.getName(),
                                result.getTriesCount(),
                                result.getTime() / 1000.0));

    }

    public void save() {
        try (PrintWriter out = new PrintWriter(file)) {
            for (GameResult result : leaderBoard) {
                out.println(result);
            }
        } catch (IOException e) {
            System.out.println("Cannot save leader board, sorry");
        }
    }

    public void load() {
        try (Scanner in = new Scanner(file)) {

            while (in.hasNext()) {
                String name = in.next();
                int triesCount = in.nextInt();
                long time = in.nextLong();

                GameResult result = new GameResult();
                result.setName(name);
                result.setTriesCount(triesCount);
                result.setTime(time);

                leaderBoard.add(result);
            }

        } catch (IOException e) {
            System.out.println("Cannot load leader board, sorry");
        }
    }
}
