package edu.jcourse.apps.notepad;

import java.time.LocalTime;

public class AlarmRecord extends NoteRecord {
    private LocalTime time;

    @Override
    public void askData() {
        time = Notepad.askTime("time: ");

        super.askData();
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("%s %s",
                super.toString(),
                time.format(Notepad.TIME_PATTERN));
    }
}
