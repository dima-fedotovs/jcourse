package edu.jcourse.apps.notepad;

public abstract class Record {
    private static int counter; // статическая переменная одна для всех
    // не статические переменные - для каждого объекта свои
    private final int id;

    // Конструктор - вызывается при создании объекта
    public Record() {
        counter++;
        id = counter;
    }

    /**
     * This method should ask user's data
     */
    public abstract void askData();

    // Только геттер - только для чтения
    public int getId() {
        return id;
    }

}
