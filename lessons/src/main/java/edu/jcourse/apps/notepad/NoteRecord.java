package edu.jcourse.apps.notepad;

public class NoteRecord extends Record {
    private String text;

    @Override
    public void askData() {
        text = Notepad.askString("text: ");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%d %s", getId(), text);
    }
}
