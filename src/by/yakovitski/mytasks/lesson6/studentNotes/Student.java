package by.yakovitski.mytasks.lesson6.studentNotes;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    public static void printList(List<Student> list){
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static Student searchTheHighestNote(List<Student> list) {
        Student student = Collections.max(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getNote() > o2.getNote())
                    return 1;
                if (o1.getNote() == o2.getNote())
                    return 0;
                return -1;
            }
        });
        return student;
    }
}
