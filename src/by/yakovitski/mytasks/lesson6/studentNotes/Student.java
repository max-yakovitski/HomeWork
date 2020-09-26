package by.yakovitski.mytasks.lesson6.studentNotes;

public class Student {
    int note;

    public Student(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student " +
                "note = " + note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
