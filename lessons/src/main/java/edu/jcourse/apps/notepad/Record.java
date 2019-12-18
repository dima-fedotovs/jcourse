package edu.jcourse.apps.notepad;

import java.time.Instant;

public abstract class Record {
    private static int counter; // статическая переменная одна для всех
    // не статические переменные - для каждого объекта свои
    private final int id;
    private final Instant createdAt;

    // Конструктор - вызывается при создании объекта
    public Record() {
        counter++;
        id = counter;
        createdAt = Instant.now();
    }


    /**
     * This method should ask user's data
     */
    public abstract void askData();

    // Только геттер - только для чтения
    public int getId() {
        return id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return String.format("%d %s", id, createdAt);
    }
}
