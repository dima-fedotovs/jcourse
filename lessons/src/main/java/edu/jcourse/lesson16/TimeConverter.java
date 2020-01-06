package edu.jcourse.lesson16;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TimeConverter {
    private static final String DT_PATTERN = "dd.MM.yyyy HH:mm";
    private static final DateTimeFormatter DT_FORMATTER
            = DateTimeFormatter.ofPattern(DT_PATTERN);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Спросить у пользователя:
        // 1. Timezone пункта отправления (String)
        // 2. Дата и время отправления (LocalDateTime)
        // 3. Timezone пункта назначения (String)
        // 4. Дата и время прибытия (LocalDateTime)

        ZoneId departureZone = askZone("Enter departure zone");
        LocalDateTime departureDT = askDateTime("Enter departure date and time");
        ZoneId destinationZone = askZone("Enter destination zone");
        LocalDateTime destinationDT = askDateTime("Enter destination date and time");


    }

    private static LocalDateTime askDateTime(String msg) {
        for (;;) {
            System.out.println(msg);
            System.out.println("format: " + DT_PATTERN);
            System.out.print("> ");
            String answer = scanner.nextLine();
            try {
                return LocalDateTime.parse(answer, DT_FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date/time");
            }
        }
    }

    private static ZoneId askZone(String msg) {
        for (;;) {
            System.out.println(msg);
            System.out.println("enter 'help' for all available zones");
            System.out.print("> ");
            String answer = scanner.nextLine();
            if ("help".equals(answer)) {
                System.out.println(
                        String.join(", ", ZoneId.getAvailableZoneIds()));
                continue;
            }
            try {
                return ZoneId.of(answer);
            } catch (DateTimeException e) {
                System.out.println("Unknown time zone");
            }
        }
    }
}
